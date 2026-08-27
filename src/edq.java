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

public class edq {
   private static final Logger d = LogUtils.getLogger();
   public static final edq a = new edq(efs.b, Optional.empty(), List.of(), List.of());
   public static final efr b = efs.n;
   public static final Codec<edq> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efs.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.e),
               asg.a(afw.a, "random_sequence").forGetter($$0x -> $$0x.f),
               asg.a(edp.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.g),
               asg.a(eex.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, edq::new)
   );
   private final efr e;
   private final Optional<afw> f;
   private final List<edp> g;
   private final List<eev> h;
   private final BiFunction<ckj, edi, ckj> i;

   edq(efr $$0, Optional<afw> $$1, List<edp> $$2, List<eev> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = eex.a($$3);
   }

   public static Consumer<ckj> a(alq $$0, Consumer<ckj> $$1) {
      return $$2 -> {
         if ($$2.a($$0.G())) {
            if ($$2.L() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  ckj $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(edo $$0, Consumer<ckj> $$1) {
      this.a(new edi.a($$0).a(this.f), $$1);
   }

   public void a(edi $$0, Consumer<ckj> $$1) {
      edi.c<?> $$2 = edi.a(this);
      if ($$0.b($$2)) {
         Consumer<ckj> $$3 = eev.a(this.i, $$1, $$0);

         for (edp $$4 : this.g) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         d.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(edo $$0, long $$1, Consumer<ckj> $$2) {
      this.a(new edi.a($$0).a($$1).a(this.f), a($$0.a(), $$2));
   }

   public void b(edo $$0, Consumer<ckj> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(edi $$0, Consumer<ckj> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<ckj> a(edo $$0, long $$1) {
      return this.a(new edi.a($$0).a($$1).a(this.f));
   }

   public ObjectArrayList<ckj> a(edo $$0) {
      return this.a(new edi.a($$0).a(this.f));
   }

   private ObjectArrayList<ckj> a(edi $$0) {
      ObjectArrayList<ckj> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public efr a() {
      return this.e;
   }

   public void a(edr $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.h.size(); $$2++) {
         this.h.get($$2).a($$0.b(".functions[" + $$2 + "]"));
      }
   }

   public void a(bhu $$0, edo $$1, long $$2) {
      edi $$3 = new edi.a($$1).a($$2).a(this.f);
      ObjectArrayList<ckj> $$4 = this.a($$3);
      ate $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         ckj $$7 = (ckj)var9.next();
         if ($$6.isEmpty()) {
            d.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), ckj.b);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<ckj> $$0, int $$1, ate $$2) {
      List<ckj> $$3 = Lists.newArrayList();
      Iterator<ckj> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         ckj $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         ckj $$6 = $$3.remove(asy.a($$2, 0, $$3.size() - 1));
         int $$7 = asy.a($$2, 1, $$6.L() / 2);
         ckj $$8 = $$6.a($$7);
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
      ac.b($$0, $$2);
   }

   private List<Integer> a(bhu $$0, ate $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.b($$2, $$1);
      return $$2;
   }

   public static edq.a b() {
      return new edq.a();
   }

   public static class a implements ees<edq.a> {
      private final Builder<edp> a = ImmutableList.builder();
      private final Builder<eev> b = ImmutableList.builder();
      private efr c = edq.b;
      private Optional<afw> d = Optional.empty();

      public edq.a a(edp.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public edq.a a(efr $$0) {
         this.c = $$0;
         return this;
      }

      public edq.a a(afw $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public edq.a a(eev.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public edq.a a() {
         return this;
      }

      public edq b() {
         return new edq(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
