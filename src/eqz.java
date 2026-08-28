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

public class eqz {
   private static final Logger f = LogUtils.getLogger();
   public static final eqz a = new eqz(etp.b, Optional.empty(), List.of(), List.of());
   public static final eto b = etp.q;
   public static final long c = 0L;
   public static final Codec<eqz> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               etp.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               akk.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               eqy.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               esk.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eqz::new)
   );
   public static final Codec<jj<eqz>> e = akg.a(lr.bb, d);
   private final eto g;
   private final Optional<akk> h;
   private final List<eqy> i;
   private final List<esi> j;
   private final BiFunction<cuc, equ, cuc> k;

   eqz(eto $$0, Optional<akk> $$1, List<eqy> $$2, List<esi> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = esk.a($$3);
   }

   public static Consumer<cuc> a(aqm $$0, Consumer<cuc> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.H() < $$2.j()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.H();

               while ($$3 > 0) {
                  cuc $$4 = $$2.c(Math.min($$2.j(), $$3));
                  $$3 -= $$4.H();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eqx $$0, Consumer<cuc> $$1) {
      this.a(new equ.a($$0).a(this.h), $$1);
   }

   public void a(equ $$0, Consumer<cuc> $$1) {
      equ.c<?> $$2 = equ.a(this);
      if ($$0.b($$2)) {
         Consumer<cuc> $$3 = esi.a(this.k, $$1, $$0);

         for (eqy $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eqx $$0, long $$1, Consumer<cuc> $$2) {
      this.a(new equ.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(eqx $$0, Consumer<cuc> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(equ $$0, Consumer<cuc> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cuc> a(eqx $$0, ayo $$1) {
      return this.a(new equ.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cuc> a(eqx $$0, long $$1) {
      return this.a(new equ.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cuc> a(eqx $$0) {
      return this.a(new equ.a($$0).a(this.h));
   }

   private ObjectArrayList<cuc> a(equ $$0) {
      ObjectArrayList<cuc> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public eto a() {
      return this.g;
   }

   public void a(era $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bpz $$0, eqx $$1, long $$2) {
      equ $$3 = new equ.a($$1).a($$2).a(this.h);
      ObjectArrayList<cuc> $$4 = this.a($$3);
      ayo $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cuc $$7 = (cuc)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.e()) {
            $$0.a($$6.remove($$6.size() - 1), cuc.l);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cuc> $$0, int $$1, ayo $$2) {
      List<cuc> $$3 = Lists.newArrayList();
      Iterator<cuc> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cuc $$5 = $$4.next();
         if ($$5.e()) {
            $$4.remove();
         } else if ($$5.H() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cuc $$6 = $$3.remove(ayg.a($$2, 0, $$3.size() - 1));
         int $$7 = ayg.a($$2, 1, $$6.H() / 2);
         cuc $$8 = $$6.a($$7);
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

   private List<Integer> a(bpz $$0, ayo $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).e()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static eqz.a b() {
      return new eqz.a();
   }

   public static class a implements ese<eqz.a> {
      private final Builder<eqy> a = ImmutableList.builder();
      private final Builder<esi> b = ImmutableList.builder();
      private eto c = eqz.b;
      private Optional<akk> d = Optional.empty();

      public eqz.a a(eqy.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eqz.a a(eto $$0) {
         this.c = $$0;
         return this;
      }

      public eqz.a a(akk $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eqz.a a(esi.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eqz.a a() {
         return this;
      }

      public eqz b() {
         return new eqz(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
