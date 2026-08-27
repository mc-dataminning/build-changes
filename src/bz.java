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

public record bz(Optional<aqa<cit>> b, Optional<hi<cit>> c, cj.d d, cj.d e, List<bj> f, List<bj> g, Optional<he<ckv>> h, Optional<cl> i) {
   private static final Codec<hi<cit>> j = jb.i.r().listOf().xmap(hi::a, $$0 -> $$0.a().toList());
   public static final Codec<bz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.a(aqa.a(jc.D), "tag").forGetter(bz::b),
               aqy.a(j, "items").forGetter(bz::c),
               aqy.a(cj.d.d, "count", cj.d.c).forGetter(bz::d),
               aqy.a(cj.d.d, "durability", cj.d.c).forGetter(bz::e),
               aqy.a(bj.a.listOf(), "enchantments", List.of()).forGetter(bz::f),
               aqy.a(bj.a.listOf(), "stored_enchantments", List.of()).forGetter(bz::g),
               aqy.a(jb.j.r(), "potion").forGetter(bz::h),
               aqy.a(cl.a, "nbt").forGetter(bz::i)
            )
            .apply($$0, bz::new)
   );

   static Optional<bz> a(Optional<aqa<cit>> $$0, Optional<hi<cit>> $$1, cj.d $$2, cj.d $$3, List<bj> $$4, List<bj> $$5, Optional<he<ckv>> $$6, Optional<cl> $$7) {
      return $$0.isEmpty() && $$1.isEmpty() && $$2.c() && $$3.c() && $$4.isEmpty() && $$5.isEmpty() && $$6.isEmpty() && $$7.isEmpty()
         ? Optional.empty()
         : Optional.of(new bz($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public boolean a(ciy $$0) {
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
            Map<cnf, Integer> $$1 = cnh.a($$0.x());

            for (bj $$2 : this.f) {
               if (!$$2.a($$1)) {
                  return false;
               }
            }
         }

         if (!this.g.isEmpty()) {
            Map<cnf, Integer> $$3 = cnh.a(chu.d($$0));

            for (bj $$4 : this.g) {
               if (!$$4.a($$3)) {
                  return false;
               }
            }
         }

         return !this.h.isPresent() || this.h.get().a() == ckx.d($$0);
      }
   }

   public static Optional<bz> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public JsonElement a() {
      return ac.a(a.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public static JsonElement a(List<bz> $$0) {
      return ac.a(a.listOf().encodeStart(JsonOps.INSTANCE, $$0), IllegalStateException::new);
   }

   public static List<bz> b(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? ac.a(a.listOf().parse(JsonOps.INSTANCE, $$0), JsonParseException::new) : List.of();
   }

   public static class a {
      private final Builder<bj> a = ImmutableList.builder();
      private final Builder<bj> b = ImmutableList.builder();
      private Optional<hi<cit>> c = Optional.empty();
      private Optional<aqa<cit>> d = Optional.empty();
      private cj.d e = cj.d.c;
      private cj.d f = cj.d.c;
      private Optional<he<ckv>> g = Optional.empty();
      private Optional<cl> h = Optional.empty();

      private a() {
      }

      public static bz.a a() {
         return new bz.a();
      }

      public bz.a a(cpl... $$0) {
         this.c = Optional.of(hi.a($$0x -> $$0x.k().j(), $$0));
         return this;
      }

      public bz.a a(aqa<cit> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bz.a a(cj.d $$0) {
         this.e = $$0;
         return this;
      }

      public bz.a b(cj.d $$0) {
         this.f = $$0;
         return this;
      }

      public bz.a a(ckv $$0) {
         this.g = Optional.of($$0.c());
         return this;
      }

      public bz.a a(qr $$0) {
         this.h = Optional.of(new cl($$0));
         return this;
      }

      public bz.a a(bj $$0) {
         this.a.add($$0);
         return this;
      }

      public bz.a b(bj $$0) {
         this.b.add($$0);
         return this;
      }

      public Optional<bz> b() {
         return bz.a(this.d, this.c, this.e, this.f, this.a.build(), this.b.build(), this.g, this.h);
      }
   }
}
