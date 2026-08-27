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

public class ecs {
   private static final Logger d = LogUtils.getLogger();
   public static final ecs a = new ecs(eeu.b, Optional.empty(), List.of(), List.of());
   public static final eet b = eeu.n;
   public static final Codec<ecs> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eeu.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.e),
               arj.a(aez.a, "random_sequence").forGetter($$0x -> $$0x.f),
               arj.a(ecr.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.g),
               arj.a(edz.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ecs::new)
   );
   private final eet e;
   private final Optional<aez> f;
   private final List<ecr> g;
   private final List<edx> h;
   private final BiFunction<cjl, eck, cjl> i;

   ecs(eet $$0, Optional<aez> $$1, List<ecr> $$2, List<edx> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = edz.a($$3);
   }

   public static Consumer<cjl> a(akt $$0, Consumer<cjl> $$1) {
      return $$2 -> {
         if ($$2.a($$0.G())) {
            if ($$2.L() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  cjl $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(ecq $$0, Consumer<cjl> $$1) {
      this.a(new eck.a($$0).a(this.f), $$1);
   }

   public void a(eck $$0, Consumer<cjl> $$1) {
      eck.c<?> $$2 = eck.a(this);
      if ($$0.b($$2)) {
         Consumer<cjl> $$3 = edx.a(this.i, $$1, $$0);

         for (ecr $$4 : this.g) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         d.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(ecq $$0, long $$1, Consumer<cjl> $$2) {
      this.a(new eck.a($$0).a($$1).a(this.f), a($$0.a(), $$2));
   }

   public void b(ecq $$0, Consumer<cjl> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eck $$0, Consumer<cjl> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cjl> a(ecq $$0, long $$1) {
      return this.a(new eck.a($$0).a($$1).a(this.f));
   }

   public ObjectArrayList<cjl> a(ecq $$0) {
      return this.a(new eck.a($$0).a(this.f));
   }

   private ObjectArrayList<cjl> a(eck $$0) {
      ObjectArrayList<cjl> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public eet a() {
      return this.e;
   }

   public void a(ect $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.h.size(); $$2++) {
         this.h.get($$2).a($$0.b(".functions[" + $$2 + "]"));
      }
   }

   public void a(bgx $$0, ecq $$1, long $$2) {
      eck $$3 = new eck.a($$1).a($$2).a(this.f);
      ObjectArrayList<cjl> $$4 = this.a($$3);
      ash $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cjl $$7 = (cjl)var9.next();
         if ($$6.isEmpty()) {
            d.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), cjl.b);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cjl> $$0, int $$1, ash $$2) {
      List<cjl> $$3 = Lists.newArrayList();
      Iterator<cjl> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cjl $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cjl $$6 = $$3.remove(asb.a($$2, 0, $$3.size() - 1));
         int $$7 = asb.a($$2, 1, $$6.L() / 2);
         cjl $$8 = $$6.a($$7);
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

   private List<Integer> a(bgx $$0, ash $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.b($$2, $$1);
      return $$2;
   }

   public static ecs.a b() {
      return new ecs.a();
   }

   public static class a implements edu<ecs.a> {
      private final Builder<ecr> a = ImmutableList.builder();
      private final Builder<edx> b = ImmutableList.builder();
      private eet c = ecs.b;
      private Optional<aez> d = Optional.empty();

      public ecs.a a(ecr.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ecs.a a(eet $$0) {
         this.c = $$0;
         return this;
      }

      public ecs.a a(aez $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ecs.a a(edx.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ecs.a a() {
         return this;
      }

      public ecs b() {
         return new ecs(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
