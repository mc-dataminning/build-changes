import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class fgq extends fgx {
   private static final int a = 0;
   private static final int b = 1;
   private final fgv c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private xa f;
   private xa g = wz.a;
   private xa h = wz.a;
   private boolean i = true;
   private boolean j = true;
   private fgx.b k = fgx.b.a;
   private fgx.b l = fgx.b.a;
   private o m = o.v;
   private fgx.a n = fgx.a.a;
   private final xx o;

   public fgq(fgv $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = xa.b($$1);
      this.o = xx.a.a($$1).a(new xg.e(xa.b($$1)));
   }

   public fgq.a a() {
      return new fgq.a(
         this.d,
         Optional.of(this.f),
         this.m != o.v ? Optional.of(this.m) : Optional.empty(),
         this.i,
         this.j,
         this.g,
         this.h,
         this.k,
         this.l,
         this.n,
         List.copyOf(this.e)
      );
   }

   public fgv b() {
      return this.c;
   }

   @Override
   public String c() {
      return this.d;
   }

   public xa d() {
      return this.f;
   }

   public xo e() {
      xo $$0 = xd.a((xa)this.f.f().c(this.o));
      o $$1 = this.o();
      if ($$1 != o.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(xa $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable xa $$0) {
      this.g = $$0 == null ? wz.a : $$0;
      this.c.b(this);
   }

   public xa f() {
      return this.g;
   }

   public void c(@Nullable xa $$0) {
      this.h = $$0 == null ? wz.a : $$0;
      this.c.b(this);
   }

   public xa g() {
      return this.h;
   }

   @Override
   public Collection<String> h() {
      return this.e;
   }

   @Override
   public xo d(xa $$0) {
      xo $$1 = xa.i().b(this.g).b($$0).b(this.h);
      o $$2 = this.o();
      if ($$2 != o.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xo a(@Nullable fgx $$0, xa $$1) {
      return $$0 == null ? $$1.f() : $$0.d($$1);
   }

   @Override
   public boolean i() {
      return this.i;
   }

   public void a(boolean $$0) {
      this.i = $$0;
      this.c.b(this);
   }

   @Override
   public boolean j() {
      return this.j;
   }

   public void b(boolean $$0) {
      this.j = $$0;
      this.c.b(this);
   }

   @Override
   public fgx.b k() {
      return this.k;
   }

   @Override
   public fgx.b l() {
      return this.l;
   }

   public void a(fgx.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(fgx.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public fgx.a m() {
      return this.n;
   }

   public void a(fgx.a $$0) {
      this.n = $$0;
      this.c.b(this);
   }

   public int n() {
      int $$0 = 0;
      if (this.i()) {
         $$0 |= 1;
      }

      if (this.j()) {
         $$0 |= 2;
      }

      return $$0;
   }

   public void a(int $$0) {
      this.a(($$0 & 1) > 0);
      this.b(($$0 & 2) > 0);
   }

   public void a(o $$0) {
      this.m = $$0;
      this.c.b(this);
   }

   @Override
   public o o() {
      return this.m;
   }

   public static record a(String b, Optional<xa> c, Optional<o> d, boolean e, boolean f, xa g, xa h, fgx.b i, fgx.b j, fgx.a k, List<String> l) {
      public static final Codec<fgq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("Name").forGetter(fgq.a::a),
                  xc.a.optionalFieldOf("DisplayName").forGetter(fgq.a::b),
                  o.x.optionalFieldOf("TeamColor").forGetter(fgq.a::c),
                  Codec.BOOL.optionalFieldOf("AllowFriendlyFire", true).forGetter(fgq.a::d),
                  Codec.BOOL.optionalFieldOf("SeeFriendlyInvisibles", true).forGetter(fgq.a::e),
                  xc.a.optionalFieldOf("MemberNamePrefix", wz.a).forGetter(fgq.a::f),
                  xc.a.optionalFieldOf("MemberNameSuffix", wz.a).forGetter(fgq.a::g),
                  fgx.b.e.optionalFieldOf("NameTagVisibility", fgx.b.a).forGetter(fgq.a::h),
                  fgx.b.e.optionalFieldOf("DeathMessageVisibility", fgx.b.a).forGetter(fgq.a::i),
                  fgx.a.e.optionalFieldOf("CollisionRule", fgx.a.a).forGetter(fgq.a::j),
                  Codec.STRING.listOf().optionalFieldOf("Players", List.of()).forGetter(fgq.a::k)
               )
               .apply($$0, fgq.a::new)
      );

      public String a() {
         return this.b;
      }

      public Optional<xa> b() {
         return this.c;
      }

      public Optional<o> c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public xa f() {
         return this.g;
      }

      public xa g() {
         return this.h;
      }

      public fgx.b h() {
         return this.i;
      }

      public fgx.b i() {
         return this.j;
      }

      public fgx.a j() {
         return this.k;
      }

      public List<String> k() {
         return this.l;
      }
   }
}
