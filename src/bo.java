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

public record bo(
   Optional<bq> b,
   Optional<bf> c,
   Optional<ch> d,
   Optional<ch> e,
   Optional<ck> f,
   Optional<cl> g,
   Optional<bm> h,
   Optional<bl> i,
   Optional<bp> j,
   Optional<bo> k,
   Optional<bo> l,
   Optional<bo> m,
   Optional<String> n
) {
   public static final Codec<bo> a = aqy.a(
      (Function<Codec<bo>, Codec<bo>>)($$0 -> RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     aqy.a(bq.a, "type").forGetter(bo::b),
                     aqy.a(bf.a, "distance").forGetter(bo::c),
                     aqy.a(ch.a, "location").forGetter(bo::d),
                     aqy.a(ch.a, "stepping_on").forGetter(bo::e),
                     aqy.a(ck.a, "effects").forGetter(bo::f),
                     aqy.a(cl.a, "nbt").forGetter(bo::g),
                     aqy.a(bm.a, "flags").forGetter(bo::h),
                     aqy.a(bl.a, "equipment").forGetter(bo::i),
                     aqy.a(bp.a, "type_specific").forGetter(bo::j),
                     aqy.a($$0, "vehicle").forGetter(bo::k),
                     aqy.a($$0, "passenger").forGetter(bo::l),
                     aqy.a($$0, "targeted_entity").forGetter(bo::m),
                     aqy.a(Codec.STRING, "team").forGetter(bo::n)
                  )
                  .apply($$1, bo::new)
         ))
   );

   public static Optional<bo> a(
      Optional<bq> $$0,
      Optional<bf> $$1,
      Optional<ch> $$2,
      Optional<ch> $$3,
      Optional<ck> $$4,
      Optional<cl> $$5,
      Optional<bm> $$6,
      Optional<bl> $$7,
      Optional<bp> $$8,
      Optional<bo> $$9,
      Optional<bo> $$10,
      Optional<bo> $$11,
      Optional<String> $$12
   ) {
      return $$0.isEmpty()
            && $$1.isEmpty()
            && $$2.isEmpty()
            && $$3.isEmpty()
            && $$4.isEmpty()
            && $$5.isEmpty()
            && $$6.isEmpty()
            && $$7.isEmpty()
            && $$8.isEmpty()
            && $$9.isEmpty()
            && $$10.isEmpty()
            && $$11.isEmpty()
            && $$12.isEmpty()
         ? Optional.empty()
         : Optional.of(new bo($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12));
   }

   public static Optional<ba> a(JsonObject $$0, String $$1, be $$2) {
      JsonElement $$3 = $$0.get($$1);
      return a($$1, $$2, $$3);
   }

   public static List<ba> b(JsonObject $$0, String $$1, be $$2) {
      JsonElement $$3 = $$0.get($$1);
      if ($$3 != null && !$$3.isJsonNull()) {
         JsonArray $$4 = arg.n($$3, $$1);
         List<ba> $$5 = new ArrayList<>($$4.size());

         for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
            a($$1 + "[" + $$6 + "]", $$2, $$4.get($$6)).ifPresent($$5::add);
         }

         return List.copyOf($$5);
      } else {
         return List.of();
      }
   }

   private static Optional<ba> a(String $$0, be $$1, @Nullable JsonElement $$2) {
      Optional<Optional<ba>> $$3 = ba.a($$0, $$1, $$2, eeq.l);
      if ($$3.isPresent()) {
         return $$3.get();
      } else {
         Optional<bo> $$4 = a($$2);
         return a($$4);
      }
   }

   public static Optional<ba> a(bo.a $$0) {
      return a($$0.b());
   }

   public static Optional<ba> a(Optional<bo> $$0) {
      return $$0.map(bo::a);
   }

   public static List<ba> a(bo.a... $$0) {
      return Stream.of($$0).flatMap($$0x -> a($$0x).stream()).toList();
   }

   public static ba a(bo $$0) {
      eff $$1 = efi.a(ecg.b.a, $$0).build();
      return new ba(List.of($$1));
   }

   public boolean a(akl $$0, @Nullable bii $$1) {
      return this.a($$0.x(), $$0.di(), $$1);
   }

   public boolean a(akk $$0, @Nullable ehd $$1, @Nullable bii $$2) {
      if ($$2 == null) {
         return false;
      } else if (this.b.isPresent() && !this.b.get().b($$2.ag())) {
         return false;
      } else {
         if ($$1 == null) {
            if (this.c.isPresent()) {
               return false;
            }
         } else if (this.c.isPresent() && !this.c.get().a($$1.c, $$1.d, $$1.e, $$2.dp(), $$2.dr(), $$2.dv())) {
            return false;
         }

         if (this.d.isPresent() && !this.d.get().a($$0, $$2.dp(), $$2.dr(), $$2.dv())) {
            return false;
         } else {
            if (this.e.isPresent()) {
               ehd $$3 = ehd.b($$2.aH());
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
            } else if (this.m.isPresent() && !this.m.get().a($$0, $$1, $$2 instanceof bja ? ((bja)$$2).j() : null)) {
               return false;
            } else {
               if (this.n.isPresent()) {
                  eie $$4 = $$2.cf();
                  if ($$4 == null || !this.n.get().equals($$4.b())) {
                     return false;
                  }
               }

               return true;
            }
         }
      }
   }

   public static Optional<bo> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public JsonElement a() {
      return ac.a(a.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public static ecg b(akl $$0, bii $$1) {
      ecm $$2 = new ecm.a($$0.x()).a(eer.a, $$1).a(eer.f, $$0.di()).a(eeq.l);
      return new ecg.a($$2).a(Optional.empty());
   }

   public static class a {
      private Optional<bq> a = Optional.empty();
      private Optional<bf> b = Optional.empty();
      private Optional<ch> c = Optional.empty();
      private Optional<ch> d = Optional.empty();
      private Optional<ck> e = Optional.empty();
      private Optional<cl> f = Optional.empty();
      private Optional<bm> g = Optional.empty();
      private Optional<bl> h = Optional.empty();
      private Optional<bp> i = Optional.empty();
      private Optional<bo> j = Optional.empty();
      private Optional<bo> k = Optional.empty();
      private Optional<bo> l = Optional.empty();
      private Optional<String> m = Optional.empty();

      public static bo.a a() {
         return new bo.a();
      }

      public bo.a a(bim<?> $$0) {
         this.a = Optional.of(bq.a($$0));
         return this;
      }

      public bo.a a(aqa<bim<?>> $$0) {
         this.a = Optional.of(bq.a($$0));
         return this;
      }

      public bo.a a(bq $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bo.a a(bf $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bo.a a(ch.a $$0) {
         this.c = $$0.b();
         return this;
      }

      public bo.a b(ch.a $$0) {
         this.d = $$0.b();
         return this;
      }

      public bo.a a(ck.a $$0) {
         this.e = $$0.b();
         return this;
      }

      public bo.a a(cl $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public bo.a a(bm.a $$0) {
         this.g = $$0.b();
         return this;
      }

      public bo.a a(bl.a $$0) {
         this.h = $$0.b();
         return this;
      }

      public bo.a a(bl $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public bo.a a(bp $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public bo.a a(bo.a $$0) {
         this.j = $$0.b();
         return this;
      }

      public bo.a b(bo.a $$0) {
         this.k = $$0.b();
         return this;
      }

      public bo.a c(bo.a $$0) {
         this.l = $$0.b();
         return this;
      }

      public bo.a a(String $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public Optional<bo> b() {
         return bo.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
      }
   }
}
