import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public record cc(Optional<aup<coy>> b, Optional<in<coy>> c, cm.d d, cm.d e, List<bm> f, List<bm> g, Optional<ij<cqz>> h, Optional<co> i) {
   private static final Codec<in<coy>> j = kf.h.r().listOf().xmap(in::a, $$0 -> $$0.a().toList());
   public static final Codec<cc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avq.a(aup.a(kg.F), "tag").forGetter(cc::a),
               avq.a(j, "items").forGetter(cc::b),
               avq.a(cm.d.d, "count", cm.d.c).forGetter(cc::c),
               avq.a(cm.d.d, "durability", cm.d.c).forGetter(cc::d),
               avq.a(bm.a.listOf(), "enchantments", List.of()).forGetter(cc::e),
               avq.a(bm.a.listOf(), "stored_enchantments", List.of()).forGetter(cc::f),
               avq.a(kf.i.r(), "potion").forGetter(cc::g),
               avq.a(co.a, "nbt").forGetter(cc::h)
            )
            .apply($$0, cc::new)
   );

   public boolean a(cpd $$0) {
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
            Map<ctm, Integer> $$1 = ctn.a($$0.y());

            for (bm $$2 : this.f) {
               if (!$$2.a($$1)) {
                  return false;
               }
            }
         }

         if (!this.g.isEmpty()) {
            Map<ctm, Integer> $$3 = ctn.a(cnz.d($$0));

            for (bm $$4 : this.g) {
               if (!$$4.a($$3)) {
                  return false;
               }
            }
         }

         return !this.h.isPresent() || this.h.get().equals(crb.d($$0));
      }
   }

   public Optional<aup<coy>> a() {
      return this.b;
   }

   public Optional<in<coy>> b() {
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

   public Optional<ij<cqz>> g() {
      return this.h;
   }

   public Optional<co> h() {
      return this.i;
   }

   public static class a {
      private final Builder<bm> a = ImmutableList.builder();
      private final Builder<bm> b = ImmutableList.builder();
      private Optional<in<coy>> c = Optional.empty();
      private Optional<aup<coy>> d = Optional.empty();
      private cm.d e = cm.d.c;
      private cm.d f = cm.d.c;
      private Optional<ij<cqz>> g = Optional.empty();
      private Optional<co> h = Optional.empty();

      private a() {
      }

      public static cc.a a() {
         return new cc.a();
      }

      public cc.a a(cvq... $$0) {
         this.c = Optional.of(in.a($$0x -> $$0x.j().i(), $$0));
         return this;
      }

      public cc.a a(aup<coy> $$0) {
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

      public cc.a a(ij<cqz> $$0) {
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
