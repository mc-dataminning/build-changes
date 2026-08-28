import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddn(bum c, jq<awk> d, Optional<ali> e, Optional<ju<bul<?>>> f, boolean g, boolean h, boolean i) {
   public static final Codec<ddn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bum.k.fieldOf("slot").forGetter(ddn::a),
               awk.b.optionalFieldOf("equip_sound", awl.as).forGetter(ddn::b),
               ali.a.optionalFieldOf("model").forGetter(ddn::c),
               kf.a(lz.z).optionalFieldOf("allowed_entities").forGetter(ddn::d),
               Codec.BOOL.optionalFieldOf("dispensable", true).forGetter(ddn::e),
               Codec.BOOL.optionalFieldOf("swappable", true).forGetter(ddn::f),
               Codec.BOOL.optionalFieldOf("damage_on_hurt", true).forGetter(ddn::g)
            )
            .apply($$0, ddn::new)
   );
   public static final zg<wt, ddn> b = zg.a(
      bum.l, ddn::a, awk.d, ddn::b, ali.b.a(ze::a), ddn::c, ze.c(lz.z).a(ze::a), ddn::d, ze.b, ddn::e, ze.b, ddn::f, ze.b, ddn::g, ddn::new
   );

   public static ddn a(cuy $$0) {
      return a(bum.g).a(awl.of).a(ddm.j.get($$0)).a(bul.an, bul.be).a();
   }

   public static ddn.a a(bum $$0) {
      return new ddn.a($$0);
   }

   public bsd a(cwb $$0, com $$1) {
      if (!$$1.e(this.c)) {
         return bsd.e;
      } else {
         cwb $$2 = $$1.a(this.c);
         if ((!dbu.a($$2, dbt.E) || $$1.f()) && !cwb.c($$0, $$2)) {
            if (!$$1.dX().y_()) {
               $$1.b(awv.c.b($$0.h()));
            }

            if ($$0.L() <= 1) {
               cwb $$3 = $$2.f() ? $$0 : $$2.g();
               cwb $$4 = $$1.f() ? $$0.v() : $$0.g();
               $$1.a(this.c, $$4);
               return bsd.a.a($$3);
            } else {
               cwb $$5 = $$2.g();
               cwb $$6 = $$0.b(1, $$1);
               $$1.a(this.c, $$6);
               if (!$$1.gk().f($$5)) {
                  $$1.a($$5, false);
               }

               return bsd.a.a($$0);
            }
         } else {
            return bsd.d;
         }
      }
   }

   public boolean a(bul<?> $$0) {
      return this.f.isEmpty() || this.f.get().a($$0.r());
   }

   public bum a() {
      return this.c;
   }

   public jq<awk> b() {
      return this.d;
   }

   public Optional<ali> c() {
      return this.e;
   }

   public Optional<ju<bul<?>>> d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public static class a {
      private final bum a;
      private jq<awk> b = awl.as;
      private Optional<ali> c = Optional.empty();
      private Optional<ju<bul<?>>> d = Optional.empty();
      private boolean e = true;
      private boolean f = true;
      private boolean g = true;

      a(bum $$0) {
         this.a = $$0;
      }

      public ddn.a a(jq<awk> $$0) {
         this.b = $$0;
         return this;
      }

      public ddn.a a(ali $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public ddn.a a(bul<?>... $$0) {
         return this.a(ju.a(bul::r, $$0));
      }

      public ddn.a a(ju<bul<?>> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ddn.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      public ddn.a b(boolean $$0) {
         this.f = $$0;
         return this;
      }

      public ddn.a c(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public ddn a() {
         return new ddn(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
