import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public record cb(Optional<arr<ckw>> b, Optional<ig<ckw>> c, cl.d d, cl.d e, List<bl> f, List<bl> g, Optional<ib<cmy>> h, Optional<cn> i) {
   private static final Codec<ig<ckw>> j = jy.i.r().listOf().xmap(ig::a, $$0 -> $$0.a().toList());
   public static final Codec<cb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asq.a(arr.a(jz.E), "tag").forGetter(cb::b),
               asq.a(j, "items").forGetter(cb::c),
               asq.a(cl.d.d, "count", cl.d.c).forGetter(cb::d),
               asq.a(cl.d.d, "durability", cl.d.c).forGetter(cb::e),
               asq.a(bl.a.listOf(), "enchantments", List.of()).forGetter(cb::f),
               asq.a(bl.a.listOf(), "stored_enchantments", List.of()).forGetter(cb::g),
               asq.a(jy.j.r(), "potion").forGetter(cb::h),
               asq.a(cn.a, "nbt").forGetter(cb::i)
            )
            .apply($$0, cb::new)
   );

   public boolean a(clb $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (this.c.isPresent() && !$$0.a(this.c.get())) {
         return false;
      } else if (!this.d.d($$0.L())) {
         return false;
      } else if (!this.e.c() && !$$0.i()) {
         return false;
      } else if (!this.e.d($$0.l() - $$0.k())) {
         return false;
      } else if (this.i.isPresent() && !this.i.get().a($$0)) {
         return false;
      } else {
         if (!this.f.isEmpty()) {
            Map<cpm, Integer> $$1 = cpo.a($$0.x());

            for (bl $$2 : this.f) {
               if (!$$2.a($$1)) {
                  return false;
               }
            }
         }

         if (!this.g.isEmpty()) {
            Map<cpm, Integer> $$3 = cpo.a(cjx.d($$0));

            for (bl $$4 : this.g) {
               if (!$$4.a($$3)) {
                  return false;
               }
            }
         }

         return !this.h.isPresent() || this.h.get().a() == cna.d($$0);
      }
   }

   public static Optional<cb> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public JsonElement a() {
      return ac.a(a.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public static JsonElement a(List<cb> $$0) {
      return ac.a(a.listOf().encodeStart(JsonOps.INSTANCE, $$0), IllegalStateException::new);
   }

   public static List<cb> b(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? ac.a(a.listOf().parse(JsonOps.INSTANCE, $$0), JsonParseException::new) : List.of();
   }

   public static class a {
      private final Builder<bl> a = ImmutableList.builder();
      private final Builder<bl> b = ImmutableList.builder();
      private Optional<ig<ckw>> c = Optional.empty();
      private Optional<arr<ckw>> d = Optional.empty();
      private cl.d e = cl.d.c;
      private cl.d f = cl.d.c;
      private Optional<ib<cmy>> g = Optional.empty();
      private Optional<cn> h = Optional.empty();

      private a() {
      }

      public static cb.a a() {
         return new cb.a();
      }

      public cb.a a(crr... $$0) {
         this.c = Optional.of(ig.a($$0x -> $$0x.k().j(), $$0));
         return this;
      }

      public cb.a a(arr<ckw> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public cb.a a(cl.d $$0) {
         this.e = $$0;
         return this;
      }

      public cb.a b(cl.d $$0) {
         this.f = $$0;
         return this;
      }

      public cb.a a(cmy $$0) {
         this.g = Optional.of($$0.c());
         return this;
      }

      public cb.a a(rz $$0) {
         this.h = Optional.of(new cn($$0));
         return this;
      }

      public cb.a a(bl $$0) {
         this.a.add($$0);
         return this;
      }

      public cb.a b(bl $$0) {
         this.b.add($$0);
         return this;
      }

      public cb b() {
         List<bl> $$0 = this.a.build();
         List<bl> $$1 = this.b.build();
         return new cb(this.d, this.c, this.e, this.f, $$0, $$1, this.g, this.h);
      }
   }
}
