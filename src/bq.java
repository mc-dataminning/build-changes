import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record bq(
   Optional<bs> b,
   Optional<bh> c,
   Optional<cj> d,
   Optional<cj> e,
   Optional<cm> f,
   Optional<cn> g,
   Optional<bo> h,
   Optional<bn> i,
   Optional<br> j,
   Optional<bq> k,
   Optional<bq> l,
   Optional<bq> m,
   Optional<String> n
) {
   public static final Codec<bq> a = asq.a(
      (Function<Codec<bq>, Codec<bq>>)($$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     asq.a(bs.a, "type").forGetter(bq::b),
                     asq.a(bh.a, "distance").forGetter(bq::c),
                     asq.a(cj.a, "location").forGetter(bq::d),
                     asq.a(cj.a, "stepping_on").forGetter(bq::e),
                     asq.a(cm.a, "effects").forGetter(bq::f),
                     asq.a(cn.a, "nbt").forGetter(bq::g),
                     asq.a(bo.a, "flags").forGetter(bq::h),
                     asq.a(bn.a, "equipment").forGetter(bq::i),
                     asq.a(br.a, "type_specific").forGetter(bq::j),
                     asq.a($$0, "vehicle").forGetter(bq::k),
                     asq.a($$0, "passenger").forGetter(bq::l),
                     asq.a($$0, "targeted_entity").forGetter(bq::m),
                     asq.a(Codec.STRING, "team").forGetter(bq::n)
                  )
                  .apply($$1, bq::new)
         ))
   );

   public static Optional<bc> a(JsonObject $$0, String $$1, bg $$2) {
      JsonElement $$3 = $$0.get($$1);
      return a($$1, $$2, $$3);
   }

   public static List<bc> b(JsonObject $$0, String $$1, bg $$2) {
      JsonElement $$3 = $$0.get($$1);
      if ($$3 != null && !$$3.isJsonNull()) {
         JsonArray $$4 = asy.n($$3, $$1);
         List<bc> $$5 = new ArrayList<>($$4.size());

         for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
            a($$1 + "[" + $$6 + "]", $$2, $$4.get($$6)).ifPresent($$5::add);
         }

         return List.copyOf($$5);
      } else {
         return List.of();
      }
   }

   private static Optional<bc> a(String $$0, bg $$1, @Nullable JsonElement $$2) {
      Optional<Optional<bc>> $$3 = bc.a($$0, $$1, $$2, egv.l);
      if ($$3.isPresent()) {
         return $$3.get();
      } else {
         Optional<bq> $$4 = a($$2);
         return a($$4);
      }
   }

   public static bc a(bq.a $$0) {
      return a($$0.b());
   }

   public static Optional<bc> a(Optional<bq> $$0) {
      return $$0.map(bq::a);
   }

   public static List<bc> a(bq.a... $$0) {
      return Stream.of($$0).map(bq::a).toList();
   }

   public static bc a(bq $$0) {
      ehk $$1 = ehn.a(eel.b.a, $$0).build();
      return new bc(List.of($$1));
   }

   public boolean a(amb $$0, @Nullable bki $$1) {
      return this.a($$0.x(), $$0.dj(), $$1);
   }

   public boolean a(ama $$0, @Nullable eji $$1, @Nullable bki $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.b.isPresent() && !this.b.get().b($$2.ag())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.c.isPresent()) {
               return false;
            }
         } else if (this.c.isPresent() && !this.c.get().a($$1.c, $$1.d, $$1.e, $$2.dq(), $$2.ds(), $$2.dw())) {
            return false;
         }

         if (this.d.isPresent() && !this.d.get().a($$0, $$2.dq(), $$2.ds(), $$2.dw())) {
            return false;
         } else {
            if (this.e.isPresent()) {
               eji $$3 = eji.b($$2.aH());
               if (!this.e.get().a($$0, $$3.a(), $$3.b(), $$3.c())) {
                  return false;
               }
            }

            if (this.f.isPresent() && !this.f.get().a($$2)) {
               return false;
            } else if (this.g.isPresent() && !this.g.get().a($$2)) {
               return false;
            } else if (this.h.isPresent() && !this.h.get().a($$2)) {
               return false;
            } else if (this.i.isPresent() && !this.i.get().a($$2)) {
               return false;
            } else if (this.j.isPresent() && !this.j.get().a($$2, $$0, $$1)) {
               return false;
            } else if (this.k.isPresent() && !this.k.get().a($$0, $$1, $$2.cY())) {
               return false;
            } else if (this.l.isPresent() && $$2.cP().stream().noneMatch($$2x -> this.l.get().a($$0, $$1, $$2x))) {
               return false;
            } else if (this.m.isPresent() && !this.m.get().a($$0, $$1, $$2 instanceof bla ? ((bla)$$2).q() : null)) {
               return false;
            } else {
               if (this.n.isPresent()) {
                  ekj $$4 = $$2.cf();
                  if ($$4 == null || !this.n.get().equals($$4.b())) {
                     return false;
                  }
               }

               return true;
            }
         }
      }
   }

   public static Optional<bq> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public JsonElement a() {
      return ac.a(a.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public static eel b(amb $$0, bki $$1) {
      eer $$2 = new eer.a($$0.x()).a(egw.a, $$1).a(egw.f, $$0.dj()).a(egv.l);
      return new eel.a($$2).a(Optional.empty());
   }

   public static class a {
      private Optional<bs> a = Optional.empty();
      private Optional<bh> b = Optional.empty();
      private Optional<cj> c = Optional.empty();
      private Optional<cj> d = Optional.empty();
      private Optional<cm> e = Optional.empty();
      private Optional<cn> f = Optional.empty();
      private Optional<bo> g = Optional.empty();
      private Optional<bn> h = Optional.empty();
      private Optional<br> i = Optional.empty();
      private Optional<bq> j = Optional.empty();
      private Optional<bq> k = Optional.empty();
      private Optional<bq> l = Optional.empty();
      private Optional<String> m = Optional.empty();

      public static bq.a a() {
         return new bq.a();
      }

      public bq.a a(bkm<?> $$0) {
         this.a = Optional.of(bs.a($$0));
         return this;
      }

      public bq.a a(arr<bkm<?>> $$0) {
         this.a = Optional.of(bs.a($$0));
         return this;
      }

      public bq.a a(bs $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bq.a a(bh $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bq.a a(cj.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bq.a b(cj.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bq.a a(cm.a $$0) {
         this.e = $$0.b();
         return this;
      }

      public bq.a a(cn $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public bq.a a(bo.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public bq.a a(bn.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public bq.a a(bn $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public bq.a a(br $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public bq.a a(bq.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public bq.a b(bq.a $$0) {
         this.k = Optional.of($$0.b());
         return this;
      }

      public bq.a c(bq.a $$0) {
         this.l = Optional.of($$0.b());
         return this;
      }

      public bq.a a(String $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public bq b() {
         return new bq(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
      }
   }
}
