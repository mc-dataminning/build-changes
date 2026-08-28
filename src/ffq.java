import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class ffq extends ffx {
   private static final int a = 0;
   private static final int b = 1;
   private final ffv c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private wy f;
   private wy g = wx.a;
   private wy h = wx.a;
   private boolean i = true;
   private boolean j = true;
   private ffx.b k = ffx.b.a;
   private ffx.b l = ffx.b.a;
   private n m = n.v;
   private ffx.a n = ffx.a.a;
   private final xv o;

   public ffq(ffv $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = wy.b($$1);
      this.o = xv.a.a($$1).a(new xe.e(wy.b($$1)));
   }

   public ffq.a a() {
      return new ffq.a(
         this.d,
         Optional.of(this.f),
         this.m != n.v ? Optional.of(this.m) : Optional.empty(),
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

   public ffv b() {
      return this.c;
   }

   @Override
   public String c() {
      return this.d;
   }

   public wy d() {
      return this.f;
   }

   public xm e() {
      xm $$0 = xb.a((wy)this.f.f().c(this.o));
      n $$1 = this.o();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(wy $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable wy $$0) {
      this.g = $$0 == null ? wx.a : $$0;
      this.c.b(this);
   }

   public wy f() {
      return this.g;
   }

   public void c(@Nullable wy $$0) {
      this.h = $$0 == null ? wx.a : $$0;
      this.c.b(this);
   }

   public wy g() {
      return this.h;
   }

   @Override
   public Collection<String> h() {
      return this.e;
   }

   @Override
   public xm d(wy $$0) {
      xm $$1 = wy.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.o();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xm a(@Nullable ffx $$0, wy $$1) {
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
   public ffx.b k() {
      return this.k;
   }

   @Override
   public ffx.b l() {
      return this.l;
   }

   public void a(ffx.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(ffx.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public ffx.a m() {
      return this.n;
   }

   public void a(ffx.a $$0) {
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

   public void a(n $$0) {
      this.m = $$0;
      this.c.b(this);
   }

   @Override
   public n o() {
      return this.m;
   }

   public static record a(String b, Optional<wy> c, Optional<n> d, boolean e, boolean f, wy g, wy h, ffx.b i, ffx.b j, ffx.a k, List<String> l) {
      public static final Codec<ffq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("Name").forGetter(ffq.a::a),
                  xa.a.optionalFieldOf("DisplayName").forGetter(ffq.a::b),
                  n.x.optionalFieldOf("TeamColor").forGetter(ffq.a::c),
                  Codec.BOOL.optionalFieldOf("AllowFriendlyFire", true).forGetter(ffq.a::d),
                  Codec.BOOL.optionalFieldOf("SeeFriendlyInvisibles", true).forGetter(ffq.a::e),
                  xa.a.optionalFieldOf("MemberNamePrefix", wx.a).forGetter(ffq.a::f),
                  xa.a.optionalFieldOf("MemberNameSuffix", wx.a).forGetter(ffq.a::g),
                  ffx.b.e.optionalFieldOf("NameTagVisibility", ffx.b.a).forGetter(ffq.a::h),
                  ffx.b.e.optionalFieldOf("DeathMessageVisibility", ffx.b.a).forGetter(ffq.a::i),
                  ffx.a.e.optionalFieldOf("CollisionRule", ffx.a.a).forGetter(ffq.a::j),
                  Codec.STRING.listOf().optionalFieldOf("Players", List.of()).forGetter(ffq.a::k)
               )
               .apply($$0, ffq.a::new)
      );

      public String a() {
         return this.b;
      }

      public Optional<wy> b() {
         return this.c;
      }

      public Optional<n> c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public wy f() {
         return this.g;
      }

      public wy g() {
         return this.h;
      }

      public ffx.b h() {
         return this.i;
      }

      public ffx.b i() {
         return this.j;
      }

      public ffx.a j() {
         return this.k;
      }

      public List<String> k() {
         return this.l;
      }
   }
}
