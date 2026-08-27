import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public record cc(Optional<auo<cou>> b, Optional<in<cou>> c, cm.d d, cm.d e, List<bm> f, List<bm> g, Optional<ij<cqv>> h, Optional<co> i) {
   private static final Codec<in<cou>> j = kf.h.r().listOf().xmap(in::a, $$0 -> $$0.a().toList());
   public static final Codec<cc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avp.a(auo.a(kg.F), "tag").forGetter(cc::a),
               avp.a(j, "items").forGetter(cc::b),
               avp.a(cm.d.d, "count", cm.d.c).forGetter(cc::c),
               avp.a(cm.d.d, "durability", cm.d.c).forGetter(cc::d),
               avp.a(bm.a.listOf(), "enchantments", List.of()).forGetter(cc::e),
               avp.a(bm.a.listOf(), "stored_enchantments", List.of()).forGetter(cc::f),
               avp.a(kf.i.r(), "potion").forGetter(cc::g),
               avp.a(co.a, "nbt").forGetter(cc::h)
            )
            .apply($$0, cc::new)
   );

   public boolean a(coz $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (this.c.isPresent() && !$$0.a(this.c.get())) {
         return false;
      } else if (!this.d.d($$0.M())) {
         return false;
      } else if (!this.e.c() && !$$0.i()) {
         return false;
      } else if (!this.e.d($$0.m() - $$0.l())) {
         return false;
      } else if (this.i.isPresent() && !this.i.get().a($$0)) {
         return false;
      } else {
         if (!this.f.isEmpty()) {
            Map<cti, Integer> $$1 = ctj.a($$0.y());

            for (bm $$2 : this.f) {
               if (!$$2.a($$1)) {
                  return false;
               }
            }
         }

         if (!this.g.isEmpty()) {
            Map<cti, Integer> $$3 = ctj.a(cnv.d($$0));

            for (bm $$4 : this.g) {
               if (!$$4.a($$3)) {
                  return false;
               }
            }
         }

         return !this.h.isPresent() || this.h.get().equals(cqx.d($$0));
      }
   }

   public Optional<auo<cou>> a() {
      return this.b;
   }

   public Optional<in<cou>> b() {
      return this.c;
   }

   public cm.d c() {
      return this.d;
   }

   public cm.d d() {
      return this.e;
   }

   public List<bm> e() {
      return this.f;
   }

   public List<bm> f() {
      return this.g;
   }

   public Optional<ij<cqv>> g() {
      return this.h;
   }

   public Optional<co> h() {
      return this.i;
   }

   public static class a {
      private final Builder<bm> a = ImmutableList.builder();
      private final Builder<bm> b = ImmutableList.builder();
      private Optional<in<cou>> c = Optional.empty();
      private Optional<auo<cou>> d = Optional.empty();
      private cm.d e = cm.d.c;
      private cm.d f = cm.d.c;
      private Optional<ij<cqv>> g = Optional.empty();
      private Optional<co> h = Optional.empty();

      private a() {
      }

      public static cc.a a() {
         return new cc.a();
      }

      public cc.a a(cvm... $$0) {
         this.c = Optional.of(in.a($$0x -> $$0x.j().i(), $$0));
         return this;
      }

      public cc.a a(auo<cou> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public cc.a a(cm.d $$0) {
         this.e = $$0;
         return this;
      }

      public cc.a b(cm.d $$0) {
         this.f = $$0;
         return this;
      }

      public cc.a a(ij<cqv> $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public cc.a a(sw $$0) {
         this.h = Optional.of(new co($$0));
         return this;
      }

      public cc.a a(bm $$0) {
         this.a.add($$0);
         return this;
      }

      public cc.a b(bm $$0) {
         this.b.add($$0);
         return this;
      }

      public cc b() {
         List<bm> $$0 = this.a.build();
         List<bm> $$1 = this.b.build();
         return new cc(this.d, this.c, this.e, this.f, $$0, $$1, this.g, this.h);
      }
   }
}
