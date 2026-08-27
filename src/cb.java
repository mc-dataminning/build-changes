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

public record cb(Optional<aqh<cja>> b, Optional<hi<cja>> c, cl.d d, cl.d e, List<bl> f, List<bl> g, Optional<he<clc>> h, Optional<cn> i) {
   private static final Codec<hi<cja>> j = jb.i.r().listOf().xmap(hi::a, $$0 -> $$0.a().toList());
   public static final Codec<cb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arf.a(aqh.a(jc.D), "tag").forGetter(cb::b),
               arf.a(j, "items").forGetter(cb::c),
               arf.a(cl.d.d, "count", cl.d.c).forGetter(cb::d),
               arf.a(cl.d.d, "durability", cl.d.c).forGetter(cb::e),
               arf.a(bl.a.listOf(), "enchantments", List.of()).forGetter(cb::f),
               arf.a(bl.a.listOf(), "stored_enchantments", List.of()).forGetter(cb::g),
               arf.a(jb.j.r(), "potion").forGetter(cb::h),
               arf.a(cn.a, "nbt").forGetter(cb::i)
            )
            .apply($$0, cb::new)
   );

   public boolean a(cjf $$0) {
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
            Map<cno, Integer> $$1 = cnq.a($$0.x());

            for (bl $$2 : this.f) {
               if (!$$2.a($$1)) {
                  return false;
               }
            }
         }

         if (!this.g.isEmpty()) {
            Map<cno, Integer> $$3 = cnq.a(cib.d($$0));

            for (bl $$4 : this.g) {
               if (!$$4.a($$3)) {
                  return false;
               }
            }
         }

         return !this.h.isPresent() || this.h.get().a() == cle.d($$0);
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
      private Optional<hi<cja>> c = Optional.empty();
      private Optional<aqh<cja>> d = Optional.empty();
      private cl.d e = cl.d.c;
      private cl.d f = cl.d.c;
      private Optional<he<clc>> g = Optional.empty();
      private Optional<cn> h = Optional.empty();

      private a() {
      }

      public static cb.a a() {
         return new cb.a();
      }

      public cb.a a(cpu... $$0) {
         this.c = Optional.of(hi.a($$0x -> $$0x.k().j(), $$0));
         return this;
      }

      public cb.a a(aqh<cja> $$0) {
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

      public cb.a a(clc $$0) {
         this.g = Optional.of($$0.c());
         return this;
      }

      public cb.a a(qw $$0) {
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
