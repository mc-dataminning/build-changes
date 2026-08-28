import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgc(bwc c, js<awj> d, Optional<alc<dga>> e, Optional<ald> f, Optional<jw<bwb<?>>> g, boolean h, boolean i, boolean j, boolean k) {
   public static final Codec<dgc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bwc.l.fieldOf("slot").forGetter(dgc::b),
               awj.b.optionalFieldOf("equip_sound", awk.as).forGetter(dgc::c),
               alc.a(dgb.a).optionalFieldOf("asset_id").forGetter(dgc::d),
               ald.a.optionalFieldOf("camera_overlay").forGetter(dgc::e),
               kh.a(me.z).optionalFieldOf("allowed_entities").forGetter(dgc::f),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(dgc::g),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(dgc::h),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(dgc::i),
               Codec.BOOL.optionalFieldOf("equip_on_interact", false).forGetter(dgc::j)
            )
            .apply($$0, dgc::new)
   );
   public static final yt<wg, dgc> b = yt.a(
      bwc.m,
      dgc::b,
      awj.d,
      dgc::c,
      alc.b(dgb.a).a(yr::a),
      dgc::d,
      ald.b.a(yr::a),
      dgc::e,
      yr.c(me.z).a(yr::a),
      dgc::f,
      yr.b,
      dgc::g,
      yr.b,
      dgc::h,
      yr.b,
      dgc::i,
      yr.b,
      dgc::j,
      dgc::new
   );

   public static dgc a(cwv $$0) {
      return a(bwc.g).a(awk.oO).a(dgb.l.get($$0)).a(bwb.ax, bwb.bx).a();
   }

   public static dgc a() {
      jt<bwb<?>> $$0 = md.a(md.f);
      return a(bwc.h).a(awk.no).a(dgb.k).a($$0.b(axd.J)).d(true).a();
   }

   public static dgc.a a(bwc $$0) {
      return new dgc.a($$0);
   }

   public btq a(cxy $$0, cqi $$1) {
      if ($$1.e(this.c) && this.a($$1.aq())) {
         cxy $$2 = $$1.a(this.c);
         if ((!dej.a($$2, dei.E) || $$1.b()) && !cxy.c($$0, $$2)) {
            if (!$$1.dV().w_()) {
               $$1.b(awu.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               cxy $$3 = $$2.f() ? $$0 : $$2.g();
               cxy $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return btq.a.a($$3);
            } else {
               cxy $$5 = $$2.g();
               cxy $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gi().f($$5)) {
                  $$1.a($$5, false);
               }

               return btq.a.a($$0);
            }
         } else {
            return btq.d;
         }
      } else {
         return btq.e;
      }
   }

   public btq a(cqi $$0, bwr $$1, cxy $$2) {
      if ($$1.a($$2, this.c) && !$$1.d(this.c) && $$1.bK()) {
         if (!$$0.dV().w_()) {
            $$1.a(this.c, $$2.a(1));
            if ($$1 instanceof bwt $$3) {
               $$3.g(this.c);
            }
         }

         return btq.a;
      } else {
         return btq.e;
      }
   }

   public boolean a(bwb<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bwc b() {
      return this.c;
   }

   public js<awj> c() {
      return this.d;
   }

   public Optional<alc<dga>> d() {
      return this.e;
   }

   public Optional<ald> e() {
      return this.f;
   }

   public Optional<jw<bwb<?>>> f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public boolean h() {
      return this.i;
   }

   public boolean i() {
      return this.j;
   }

   public boolean j() {
      return this.k;
   }

   public static class a {
      private final bwc a;
      private js<awj> b = awk.as;
      private Optional<alc<dga>> c = Optional.empty();
      private Optional<ald> d = Optional.empty();
      private Optional<jw<bwb<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;
      private boolean i;

      a(bwc $$0) {
         this.a = $$0;
      }

      public dgc.a a(js<awj> $$0) {
         this.b = $$0;
         return this;
      }

      public dgc.a a(alc<dga> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public dgc.a a(ald $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dgc.a a(bwb<?>... $$0) {
         return this.a(jw.a(bwb::r, $$0));
      }

      public dgc.a a(jw<bwb<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dgc.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public dgc.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public dgc.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public dgc.a d(boolean $$0) {
         this.i = $$0;
         return this;
      }

      public dgc a() {
         return new dgc(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
