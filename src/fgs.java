import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class fgs extends fgz {
   private static final int a = 0;
   private static final int b = 1;
   private final fgx c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private xc f;
   private xc g = xb.a;
   private xc h = xb.a;
   private boolean i = true;
   private boolean j = true;
   private fgz.b k = fgz.b.a;
   private fgz.b l = fgz.b.a;
   private o m = o.v;
   private fgz.a n = fgz.a.a;
   private final xz o;

   public fgs(fgx $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = xc.b($$1);
      this.o = xz.a.a($$1).a(new xi.e(xc.b($$1)));
   }

   public fgs.a a() {
      return new fgs.a(
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

   public fgx b() {
      return this.c;
   }

   @Override
   public String c() {
      return this.d;
   }

   public xc d() {
      return this.f;
   }

   public xq e() {
      xq $$0 = xf.a((xc)this.f.f().c(this.o));
      o $$1 = this.o();
      if ($$1 != o.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(xc $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable xc $$0) {
      this.g = $$0 == null ? xb.a : $$0;
      this.c.b(this);
   }

   public xc f() {
      return this.g;
   }

   public void c(@Nullable xc $$0) {
      this.h = $$0 == null ? xb.a : $$0;
      this.c.b(this);
   }

   public xc g() {
      return this.h;
   }

   @Override
   public Collection<String> h() {
      return this.e;
   }

   @Override
   public xq d(xc $$0) {
      xq $$1 = xc.i().b(this.g).b($$0).b(this.h);
      o $$2 = this.o();
      if ($$2 != o.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xq a(@Nullable fgz $$0, xc $$1) {
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
   public fgz.b k() {
      return this.k;
   }

   @Override
   public fgz.b l() {
      return this.l;
   }

   public void a(fgz.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(fgz.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public fgz.a m() {
      return this.n;
   }

   public void a(fgz.a $$0) {
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

   public static record a(String b, Optional<xc> c, Optional<o> d, boolean e, boolean f, xc g, xc h, fgz.b i, fgz.b j, fgz.a k, List<String> l) {
      public static final Codec<fgs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("Name").forGetter(fgs.a::a),
                  xe.a.optionalFieldOf("DisplayName").forGetter(fgs.a::b),
                  o.x.optionalFieldOf("TeamColor").forGetter(fgs.a::c),
                  Codec.BOOL.optionalFieldOf("AllowFriendlyFire", true).forGetter(fgs.a::d),
                  Codec.BOOL.optionalFieldOf("SeeFriendlyInvisibles", true).forGetter(fgs.a::e),
                  xe.a.optionalFieldOf("MemberNamePrefix", xb.a).forGetter(fgs.a::f),
                  xe.a.optionalFieldOf("MemberNameSuffix", xb.a).forGetter(fgs.a::g),
                  fgz.b.e.optionalFieldOf("NameTagVisibility", fgz.b.a).forGetter(fgs.a::h),
                  fgz.b.e.optionalFieldOf("DeathMessageVisibility", fgz.b.a).forGetter(fgs.a::i),
                  fgz.a.e.optionalFieldOf("CollisionRule", fgz.a.a).forGetter(fgs.a::j),
                  Codec.STRING.listOf().optionalFieldOf("Players", List.of()).forGetter(fgs.a::k)
               )
               .apply($$0, fgs.a::new)
      );

      public String a() {
         return this.b;
      }

      public Optional<xc> b() {
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

      public xc f() {
         return this.g;
      }

      public xc g() {
         return this.h;
      }

      public fgz.b h() {
         return this.i;
      }

      public fgz.b i() {
         return this.j;
      }

      public fgz.a j() {
         return this.k;
      }

      public List<String> k() {
         return this.l;
      }
   }
}
