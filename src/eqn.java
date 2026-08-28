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

public class eqn {
   private static final Logger f = LogUtils.getLogger();
   public static final eqn a = new eqn(etd.b, Optional.empty(), List.of(), List.of());
   public static final etc b = etd.q;
   public static final long c = 0L;
   public static final Codec<eqn> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               etd.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               alf.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               eqm.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               erx.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eqn::new)
   );
   public static final Codec<ji<eqn>> e = alb.a(lq.aU, d);
   private final etc g;
   private final Optional<alf> h;
   private final List<eqm> i;
   private final List<erv> j;
   private final BiFunction<cup, eqi, cup> k;

   eqn(etc $$0, Optional<alf> $$1, List<eqm> $$2, List<erv> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = erx.a($$3);
   }

   public static Consumer<cup> a(arf $$0, Consumer<cup> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.I() < $$2.j()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.I();

               while ($$3 > 0) {
                  cup $$4 = $$2.c(Math.min($$2.j(), $$3));
                  $$3 -= $$4.I();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eql $$0, Consumer<cup> $$1) {
      this.a(new eqi.a($$0).a(this.h), $$1);
   }

   public void a(eqi $$0, Consumer<cup> $$1) {
      eqi.c<?> $$2 = eqi.a(this);
      if ($$0.b($$2)) {
         Consumer<cup> $$3 = erv.a(this.k, $$1, $$0);

         for (eqm $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eql $$0, long $$1, Consumer<cup> $$2) {
      this.a(new eqi.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(eql $$0, Consumer<cup> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eqi $$0, Consumer<cup> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cup> a(eql $$0, long $$1) {
      return this.a(new eqi.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cup> a(eql $$0) {
      return this.a(new eqi.a($$0).a(this.h));
   }

   private ObjectArrayList<cup> a(eqi $$0) {
      ObjectArrayList<cup> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public etc a() {
      return this.g;
   }

   public void a(eqo $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bqn $$0, eql $$1, long $$2) {
      eqi $$3 = new eqi.a($$1).a($$2).a(this.h);
      ObjectArrayList<cup> $$4 = this.a($$3);
      azh $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cup $$7 = (cup)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.e()) {
            $$0.a($$6.remove($$6.size() - 1), cup.l);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cup> $$0, int $$1, azh $$2) {
      List<cup> $$3 = Lists.newArrayList();
      Iterator<cup> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cup $$5 = $$4.next();
         if ($$5.e()) {
            $$4.remove();
         } else if ($$5.I() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cup $$6 = $$3.remove(ayz.a($$2, 0, $$3.size() - 1));
         int $$7 = ayz.a($$2, 1, $$6.I() / 2);
         cup $$8 = $$6.a($$7);
         if ($$6.I() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.I() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ac.c($$0, $$2);
   }

   private List<Integer> a(bqn $$0, azh $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).e()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static eqn.a b() {
      return new eqn.a();
   }

   public static class a implements err<eqn.a> {
      private final Builder<eqm> a = ImmutableList.builder();
      private final Builder<erv> b = ImmutableList.builder();
      private etc c = eqn.b;
      private Optional<alf> d = Optional.empty();

      public eqn.a a(eqm.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eqn.a a(etc $$0) {
         this.c = $$0;
         return this;
      }

      public eqn.a a(alf $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eqn.a a(erv.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eqn.a a() {
         return this;
      }

      public eqn b() {
         return new eqn(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
