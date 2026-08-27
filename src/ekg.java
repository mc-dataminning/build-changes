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

public class ekg {
   private static final Logger d = LogUtils.getLogger();
   public static final ekg a = new ekg(emi.b, Optional.empty(), List.of(), List.of());
   public static final emh b = emi.p;
   public static final Codec<ekg> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emi.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.e),
               avu.a(ajc.a, "random_sequence").forGetter($$0x -> $$0x.f),
               avu.a(ekf.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.g),
               avu.a(eln.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ekg::new)
   );
   private final emh e;
   private final Optional<ajc> f;
   private final List<ekf> g;
   private final List<ell> h;
   private final BiFunction<cpq, ejy, cpq> i;

   ekg(emh $$0, Optional<ajc> $$1, List<ekf> $$2, List<ell> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = eln.a($$3);
   }

   public static Consumer<cpq> a(apa $$0, Consumer<cpq> $$1) {
      return $$2 -> {
         if ($$2.a($$0.I())) {
            if ($$2.M() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  cpq $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eke $$0, Consumer<cpq> $$1) {
      this.a(new ejy.a($$0).a(this.f), $$1);
   }

   public void a(ejy $$0, Consumer<cpq> $$1) {
      ejy.c<?> $$2 = ejy.a(this);
      if ($$0.b($$2)) {
         Consumer<cpq> $$3 = ell.a(this.i, $$1, $$0);

         for (ekf $$4 : this.g) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         d.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eke $$0, long $$1, Consumer<cpq> $$2) {
      this.a(new ejy.a($$0).a($$1).a(this.f), a($$0.a(), $$2));
   }

   public void b(eke $$0, Consumer<cpq> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(ejy $$0, Consumer<cpq> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cpq> a(eke $$0, long $$1) {
      return this.a(new ejy.a($$0).a($$1).a(this.f));
   }

   public ObjectArrayList<cpq> a(eke $$0) {
      return this.a(new ejy.a($$0).a(this.f));
   }

   private ObjectArrayList<cpq> a(ejy $$0) {
      ObjectArrayList<cpq> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public emh a() {
      return this.e;
   }

   public void a(ekh $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.h.size(); $$2++) {
         this.h.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bme $$0, eke $$1, long $$2) {
      ejy $$3 = new ejy.a($$1).a($$2).a(this.f);
      ObjectArrayList<cpq> $$4 = this.a($$3);
      awt $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cpq $$7 = (cpq)var9.next();
         if ($$6.isEmpty()) {
            d.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), cpq.h);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cpq> $$0, int $$1, awt $$2) {
      List<cpq> $$3 = Lists.newArrayList();
      Iterator<cpq> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cpq $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cpq $$6 = $$3.remove(awm.a($$2, 0, $$3.size() - 1));
         int $$7 = awm.a($$2, 1, $$6.M() / 2);
         cpq $$8 = $$6.a($$7);
         if ($$6.M() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.M() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ac.c($$0, $$2);
   }

   private List<Integer> a(bme $$0, awt $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static ekg.a b() {
      return new ekg.a();
   }

   public static class a implements eli<ekg.a> {
      private final Builder<ekf> a = ImmutableList.builder();
      private final Builder<ell> b = ImmutableList.builder();
      private emh c = ekg.b;
      private Optional<ajc> d = Optional.empty();

      public ekg.a a(ekf.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ekg.a a(emh $$0) {
         this.c = $$0;
         return this;
      }

      public ekg.a a(ajc $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ekg.a a(ell.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ekg.a a() {
         return this;
      }

      public ekg b() {
         return new ekg(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
