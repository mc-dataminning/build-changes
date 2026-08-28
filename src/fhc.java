import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class fhc extends fhj {
   private static final int a = 0;
   private static final int b = 1;
   private final fhh c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private xg f;
   private xg g = xf.a;
   private xg h = xf.a;
   private boolean i = true;
   private boolean j = true;
   private fhj.b k = fhj.b.a;
   private fhj.b l = fhj.b.a;
   private o m = o.v;
   private fhj.a n = fhj.a.a;
   private final yd o;

   public fhc(fhh $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = xg.b($$1);
      this.o = yd.a.a($$1).a(new xm.e(xg.b($$1)));
   }

   public fhc.a a() {
      return new fhc.a(
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

   public fhh b() {
      return this.c;
   }

   @Override
   public String c() {
      return this.d;
   }

   public xg d() {
      return this.f;
   }

   public xu e() {
      xu $$0 = xj.a((xg)this.f.f().c(this.o));
      o $$1 = this.o();
      if ($$1 != o.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(xg $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable xg $$0) {
      this.g = $$0 == null ? xf.a : $$0;
      this.c.b(this);
   }

   public xg f() {
      return this.g;
   }

   public void c(@Nullable xg $$0) {
      this.h = $$0 == null ? xf.a : $$0;
      this.c.b(this);
   }

   public xg g() {
      return this.h;
   }

   @Override
   public Collection<String> h() {
      return this.e;
   }

   @Override
   public xu d(xg $$0) {
      xu $$1 = xg.i().b(this.g).b($$0).b(this.h);
      o $$2 = this.o();
      if ($$2 != o.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xu a(@Nullable fhj $$0, xg $$1) {
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
   public fhj.b k() {
      return this.k;
   }

   @Override
   public fhj.b l() {
      return this.l;
   }

   public void a(fhj.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(fhj.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public fhj.a m() {
      return this.n;
   }

   public void a(fhj.a $$0) {
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

   public static record a(String b, Optional<xg> c, Optional<o> d, boolean e, boolean f, xg g, xg h, fhj.b i, fhj.b j, fhj.a k, List<String> l) {
      public static final Codec<fhc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("Name").forGetter(fhc.a::a),
                  xi.a.optionalFieldOf("DisplayName").forGetter(fhc.a::b),
                  o.x.optionalFieldOf("TeamColor").forGetter(fhc.a::c),
                  Codec.BOOL.optionalFieldOf("AllowFriendlyFire", true).forGetter(fhc.a::d),
                  Codec.BOOL.optionalFieldOf("SeeFriendlyInvisibles", true).forGetter(fhc.a::e),
                  xi.a.optionalFieldOf("MemberNamePrefix", xf.a).forGetter(fhc.a::f),
                  xi.a.optionalFieldOf("MemberNameSuffix", xf.a).forGetter(fhc.a::g),
                  fhj.b.e.optionalFieldOf("NameTagVisibility", fhj.b.a).forGetter(fhc.a::h),
                  fhj.b.e.optionalFieldOf("DeathMessageVisibility", fhj.b.a).forGetter(fhc.a::i),
                  fhj.a.e.optionalFieldOf("CollisionRule", fhj.a.a).forGetter(fhc.a::j),
                  Codec.STRING.listOf().optionalFieldOf("Players", List.of()).forGetter(fhc.a::k)
               )
               .apply($$0, fhc.a::new)
      );

      public String a() {
         return this.b;
      }

      public Optional<xg> b() {
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

      public xg f() {
         return this.g;
      }

      public xg g() {
         return this.h;
      }

      public fhj.b h() {
         return this.i;
      }

      public fhj.b i() {
         return this.j;
      }

      public fhj.a j() {
         return this.k;
      }

      public List<String> k() {
         return this.l;
      }
   }
}
