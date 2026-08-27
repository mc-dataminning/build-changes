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

public class egm {
   private static final Logger d = LogUtils.getLogger();
   public static final egm a = new egm(eio.b, Optional.empty(), List.of(), List.of());
   public static final ein b = eio.n;
   public static final Codec<egm> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eio.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.e),
               atg.a(agt.a, "random_sequence").forGetter($$0x -> $$0x.f),
               atg.a(egl.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.g),
               atg.a(eht.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, egm::new)
   );
   private final ein e;
   private final Optional<agt> f;
   private final List<egl> g;
   private final List<ehr> h;
   private final BiFunction<cmh, ege, cmh> i;

   egm(ein $$0, Optional<agt> $$1, List<egl> $$2, List<ehr> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = eht.a($$3);
   }

   public static Consumer<cmh> a(amp $$0, Consumer<cmh> $$1) {
      return $$2 -> {
         if ($$2.a($$0.H())) {
            if ($$2.L() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  cmh $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(egk $$0, Consumer<cmh> $$1) {
      this.a(new ege.a($$0).a(this.f), $$1);
   }

   public void a(ege $$0, Consumer<cmh> $$1) {
      ege.c<?> $$2 = ege.a(this);
      if ($$0.b($$2)) {
         Consumer<cmh> $$3 = ehr.a(this.i, $$1, $$0);

         for (egl $$4 : this.g) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         d.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(egk $$0, long $$1, Consumer<cmh> $$2) {
      this.a(new ege.a($$0).a($$1).a(this.f), a($$0.a(), $$2));
   }

   public void b(egk $$0, Consumer<cmh> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(ege $$0, Consumer<cmh> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cmh> a(egk $$0, long $$1) {
      return this.a(new ege.a($$0).a($$1).a(this.f));
   }

   public ObjectArrayList<cmh> a(egk $$0) {
      return this.a(new ege.a($$0).a(this.f));
   }

   private ObjectArrayList<cmh> a(ege $$0) {
      ObjectArrayList<cmh> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public ein a() {
      return this.e;
   }

   public void a(egn $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.h.size(); $$2++) {
         this.h.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bje $$0, egk $$1, long $$2) {
      ege $$3 = new ege.a($$1).a($$2).a(this.f);
      ObjectArrayList<cmh> $$4 = this.a($$3);
      auf $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cmh $$7 = (cmh)var9.next();
         if ($$6.isEmpty()) {
            d.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), cmh.f);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cmh> $$0, int $$1, auf $$2) {
      List<cmh> $$3 = Lists.newArrayList();
      Iterator<cmh> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cmh $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cmh $$6 = $$3.remove(aty.a($$2, 0, $$3.size() - 1));
         int $$7 = aty.a($$2, 1, $$6.L() / 2);
         cmh $$8 = $$6.a($$7);
         if ($$6.L() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.L() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ac.c($$0, $$2);
   }

   private List<Integer> a(bje $$0, auf $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static egm.a b() {
      return new egm.a();
   }

   public static class a implements eho<egm.a> {
      private final Builder<egl> a = ImmutableList.builder();
      private final Builder<ehr> b = ImmutableList.builder();
      private ein c = egm.b;
      private Optional<agt> d = Optional.empty();

      public egm.a a(egl.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public egm.a a(ein $$0) {
         this.c = $$0;
         return this;
      }

      public egm.a a(agt $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public egm.a a(ehr.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public egm.a a() {
         return this;
      }

      public egm b() {
         return new egm(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
