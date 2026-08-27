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

public class ejk {
   private static final Logger d = LogUtils.getLogger();
   public static final ejk a = new ejk(elm.b, Optional.empty(), List.of(), List.of());
   public static final ell b = elm.o;
   public static final Codec<ejk> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elm.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.e),
               avq.a(aiy.a, "random_sequence").forGetter($$0x -> $$0x.f),
               avq.a(ejj.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.g),
               avq.a(ekr.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ejk::new)
   );
   private final ell e;
   private final Optional<aiy> f;
   private final List<ejj> g;
   private final List<ekp> h;
   private final BiFunction<cpd, ejc, cpd> i;

   ejk(ell $$0, Optional<aiy> $$1, List<ejj> $$2, List<ekp> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = ekr.a($$3);
   }

   public static Consumer<cpd> a(aow $$0, Consumer<cpd> $$1) {
      return $$2 -> {
         if ($$2.a($$0.I())) {
            if ($$2.M() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  cpd $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eji $$0, Consumer<cpd> $$1) {
      this.a(new ejc.a($$0).a(this.f), $$1);
   }

   public void a(ejc $$0, Consumer<cpd> $$1) {
      ejc.c<?> $$2 = ejc.a(this);
      if ($$0.b($$2)) {
         Consumer<cpd> $$3 = ekp.a(this.i, $$1, $$0);

         for (ejj $$4 : this.g) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         d.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eji $$0, long $$1, Consumer<cpd> $$2) {
      this.a(new ejc.a($$0).a($$1).a(this.f), a($$0.a(), $$2));
   }

   public void b(eji $$0, Consumer<cpd> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(ejc $$0, Consumer<cpd> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cpd> a(eji $$0, long $$1) {
      return this.a(new ejc.a($$0).a($$1).a(this.f));
   }

   public ObjectArrayList<cpd> a(eji $$0) {
      return this.a(new ejc.a($$0).a(this.f));
   }

   private ObjectArrayList<cpd> a(ejc $$0) {
      ObjectArrayList<cpd> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public ell a() {
      return this.e;
   }

   public void a(ejl $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.h.size(); $$2++) {
         this.h.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(blp $$0, eji $$1, long $$2) {
      ejc $$3 = new ejc.a($$1).a($$2).a(this.f);
      ObjectArrayList<cpd> $$4 = this.a($$3);
      awp $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cpd $$7 = (cpd)var9.next();
         if ($$6.isEmpty()) {
            d.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), cpd.h);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cpd> $$0, int $$1, awp $$2) {
      List<cpd> $$3 = Lists.newArrayList();
      Iterator<cpd> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cpd $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cpd $$6 = $$3.remove(awi.a($$2, 0, $$3.size() - 1));
         int $$7 = awi.a($$2, 1, $$6.M() / 2);
         cpd $$8 = $$6.a($$7);
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

   private List<Integer> a(blp $$0, awp $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static ejk.a b() {
      return new ejk.a();
   }

   public static class a implements ekm<ejk.a> {
      private final Builder<ejj> a = ImmutableList.builder();
      private final Builder<ekp> b = ImmutableList.builder();
      private ell c = ejk.b;
      private Optional<aiy> d = Optional.empty();

      public ejk.a a(ejj.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ejk.a a(ell $$0) {
         this.c = $$0;
         return this;
      }

      public ejk.a a(aiy $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ejk.a a(ekp.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ejk.a a() {
         return this;
      }

      public ejk b() {
         return new ejk(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
