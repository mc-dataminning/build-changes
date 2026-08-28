import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record det(bus c, jr<avz> d, Optional<aku<der>> e, Optional<akv> f, Optional<jv<bur<?>>> g, boolean h, boolean i, boolean j) {
   public static final Codec<det> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bus.k.fieldOf("slot").forGetter(det::a),
               avz.b.optionalFieldOf("equip_sound", awa.as).forGetter(det::b),
               aku.a(des.a).optionalFieldOf("asset_id").forGetter(det::c),
               akv.a.optionalFieldOf("camera_overlay").forGetter(det::d),
               kg.a(mc.z).optionalFieldOf("allowed_entities").forGetter(det::e),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(det::f),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(det::g),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(det::h)
            )
            .apply($$0, det::new)
   );
   public static final yn<wa, det> b = yn.a(
      bus.l,
      det::a,
      avz.d,
      det::b,
      aku.b(des.a).a(yl::a),
      det::c,
      akv.b.a(yl::a),
      det::d,
      yl.c(mc.z).a(yl::a),
      det::e,
      yl.b,
      det::f,
      yl.b,
      det::g,
      yl.b,
      det::h,
      det::new
   );

   public static det a(cvl $$0) {
      return a(bus.g).a(awa.oE).a(des.k.get($$0)).a(bur.ax, bur.bx).a();
   }

   public static det.a a(bus $$0) {
      return new det.a($$0);
   }

   public bsj a(cwo $$0, cow $$1) {
      if (!$$1.e(this.c)) {
         return bsj.e;
      } else {
         cwo $$2 = $$1.a(this.c);
         if ((!dda.a($$2, dcz.E) || $$1.b()) && !cwo.c($$0, $$2)) {
            if (!$$1.dV().B_()) {
               $$1.b(awk.c.b($$0.h()));
            }

            if ($$0.M() <= 1) {
               cwo $$3 = $$2.f() ? $$0 : $$2.g();
               cwo $$4 = $$1.b() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bsj.a.a($$3);
            } else {
               cwo $$5 = $$2.g();
               cwo $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gi().f($$5)) {
                  $$1.a($$5, false);
               }

               return bsj.a.a($$0);
            }
         } else {
            return bsj.d;
         }
      }
   }

   public boolean a(bur<?> $$0) {
      return this.g.isEmpty() || this.g.get().a($$0.r());
   }

   public bus a() {
      return this.c;
   }

   public jr<avz> b() {
      return this.d;
   }

   public Optional<aku<der>> c() {
      return this.e;
   }

   public Optional<akv> d() {
      return this.f;
   }

   public Optional<jv<bur<?>>> e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public static class a {
      private final bus a;
      private jr<avz> b = awa.as;
      private Optional<aku<der>> c = Optional.empty();
      private Optional<akv> d = Optional.empty();
      private Optional<jv<bur<?>>> e = Optional.empty();
      private boolean f = true;
      private boolean g = true;
      private boolean h = true;

      a(bus $$0) {
         this.a = $$0;
      }

      public det.a a(jr<avz> $$0) {
         this.b = $$0;
         return this;
      }

      public det.a a(aku<der> $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public det.a a(akv $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public det.a a(bur<?>... $$0) {
         return this.a(jv.a(bur::r, $$0));
      }

      public det.a a(jv<bur<?>> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public det.a a(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public det.a b(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public det.a c(boolean $$0) {
         this.h = $$0;
         return this;
      }

      public det a() {
         return new det(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
