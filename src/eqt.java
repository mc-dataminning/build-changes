import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class eqt {
   private static final Logger f = LogUtils.getLogger();
   public static final eqt a = new eqt(etj.b, Optional.empty(), List.of(), List.of());
   public static final eti b = etj.q;
   public static final long c = 0L;
   public static final Codec<eqt> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               etj.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               akk.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               eqs.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               ese.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eqt::new)
   );
   public static final Codec<jj<eqt>> e = akg.a(lr.bb, d);
   private final eti g;
   private final Optional<akk> h;
   private final List<eqs> i;
   private final List<esc> j;
   private final BiFunction<cua, eqo, cua> k;

   eqt(eti $$0, Optional<akk> $$1, List<eqs> $$2, List<esc> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = ese.a($$3);
   }

   public static Consumer<cua> a(aqk $$0, Consumer<cua> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.H() < $$2.j()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.H();

               while ($$3 > 0) {
                  cua $$4 = $$2.c(Math.min($$2.j(), $$3));
                  $$3 -= $$4.H();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eqr $$0, Consumer<cua> $$1) {
      this.a(new eqo.a($$0).a(this.h), $$1);
   }

   public void a(eqo $$0, Consumer<cua> $$1) {
      eqo.c<?> $$2 = eqo.a(this);
      if ($$0.b($$2)) {
         Consumer<cua> $$3 = esc.a(this.k, $$1, $$0);

         for (eqs $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eqr $$0, long $$1, Consumer<cua> $$2) {
      this.a(new eqo.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(eqr $$0, Consumer<cua> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eqo $$0, Consumer<cua> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cua> a(eqr $$0, long $$1) {
      return this.a(new eqo.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cua> a(eqr $$0) {
      return this.a(new eqo.a($$0).a(this.h));
   }

   private ObjectArrayList<cua> a(eqo $$0) {
      ObjectArrayList<cua> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public eti a() {
      return this.g;
   }

   public void a(equ $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bpw $$0, eqr $$1, long $$2) {
      eqo $$3 = new eqo.a($$1).a($$2).a(this.h);
      ObjectArrayList<cua> $$4 = this.a($$3);
      aym $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cua $$7 = (cua)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.e()) {
            $$0.a($$6.remove($$6.size() - 1), cua.l);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cua> $$0, int $$1, aym $$2) {
      List<cua> $$3 = Lists.newArrayList();
      Iterator<cua> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cua $$5 = $$4.next();
         if ($$5.e()) {
            $$4.remove();
         } else if ($$5.H() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cua $$6 = $$3.remove(aye.a($$2, 0, $$3.size() - 1));
         int $$7 = aye.a($$2, 1, $$6.H() / 2);
         cua $$8 = $$6.a($$7);
         if ($$6.H() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.H() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ac.c($$0, $$2);
   }

   private List<Integer> a(bpw $$0, aym $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).e()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static eqt.a b() {
      return new eqt.a();
   }

   public static class a implements ery<eqt.a> {
      private final Builder<eqs> a = ImmutableList.builder();
      private final Builder<esc> b = ImmutableList.builder();
      private eti c = eqt.b;
      private Optional<akk> d = Optional.empty();

      public eqt.a a(eqs.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eqt.a a(eti $$0) {
         this.c = $$0;
         return this;
      }

      public eqt.a a(akk $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eqt.a a(esc.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eqt.a a() {
         return this;
      }

      public eqt b() {
         return new eqt(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
