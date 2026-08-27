import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record cc(Optional<ir<crn>> b, cm.d c, cm.d d, List<bm> e, List<bm> f, Optional<ir<cto>> g, Optional<co> h, jp i) {
   public static final Codec<cc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.a(jc.a(ku.G), "items").forGetter(cc::a),
               awu.a(cm.d.d, "count", cm.d.c).forGetter(cc::b),
               awu.a(cm.d.d, "durability", cm.d.c).forGetter(cc::c),
               awu.a(bm.a.listOf(), "enchantments", List.of()).forGetter(cc::d),
               awu.a(bm.a.listOf(), "stored_enchantments", List.of()).forGetter(cc::e),
               awu.a(jc.a(ku.Y), "potions").forGetter(cc::f),
               awu.a(co.a, "custom_data").forGetter(cc::g),
               awu.a(jp.a, "components", jp.c).forGetter(cc::h)
            )
            .apply($$0, cc::new)
   );

   public boolean a(crs $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (!this.c.d($$0.G())) {
         return false;
      } else if (!this.d.c() && !$$0.k()) {
         return false;
      } else if (!this.d.d($$0.n() - $$0.m())) {
         return false;
      } else if (this.h.isPresent() && !this.h.get().a($$0)) {
         return false;
      } else {
         if (!this.e.isEmpty()) {
            cxg $$1 = $$0.a(jr.f, cxg.a);

            for (bm $$2 : this.e) {
               if (!$$2.a($$1)) {
                  return false;
               }
            }
         }

         if (!this.f.isEmpty()) {
            cxg $$3 = $$0.a(jr.p, cxg.a);

            for (bm $$4 : this.f) {
               if (!$$4.a($$3)) {
                  return false;
               }
            }
         }

         if (this.g.isPresent()) {
            Optional<in<cto>> $$5 = $$0.a(jr.x, ctq.a).f();
            if ($$5.isEmpty() || !this.g.get().a($$5.get())) {
               return false;
            }
         }

         return this.i.a($$0);
      }
   }

   public Optional<ir<crn>> a() {
      return this.b;
   }

   public cm.d b() {
      return this.c;
   }

   public cm.d c() {
      return this.d;
   }

   public List<bm> d() {
      return this.e;
   }

   public List<bm> e() {
      return this.f;
   }

   public Optional<ir<cto>> f() {
      return this.g;
   }

   public Optional<co> g() {
      return this.h;
   }

   public jp h() {
      return this.i;
   }

   public static class a {
      private final Builder<bm> a = ImmutableList.builder();
      private final Builder<bm> b = ImmutableList.builder();
      private Optional<ir<crn>> c = Optional.empty();
      private cm.d d = cm.d.c;
      private cm.d e = cm.d.c;
      private Optional<ir<cto>> f = Optional.empty();
      private Optional<co> g = Optional.empty();
      private jp h = jp.c;

      private a() {
      }

      public static cc.a a() {
         return new cc.a();
      }

      public cc.a a(czf... $$0) {
         this.c = Optional.of(ir.a($$0x -> $$0x.p().n(), $$0));
         return this;
      }

      public cc.a a(avt<crn> $$0) {
         this.c = Optional.of(kt.h.a($$0));
         return this;
      }

      public cc.a a(cm.d $$0) {
         this.d = $$0;
         return this;
      }

      public cc.a b(cm.d $$0) {
         this.e = $$0;
         return this;
      }

      public cc.a a(ir<cto> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public cc.a a(to $$0) {
         this.g = Optional.of(new co($$0));
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

      public cc.a a(jp $$0) {
         this.h = $$0;
         return this;
      }

      public cc b() {
         List<bm> $$0 = this.a.build();
         List<bm> $$1 = this.b.build();
         return new cc(this.c, this.d, this.e, $$0, $$1, this.f, this.g, this.h);
      }
   }
}
