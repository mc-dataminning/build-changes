import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class ffx extends fge {
   private static final int a = 0;
   private static final int b = 1;
   private final fgc c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private wy f;
   private wy g = wx.a;
   private wy h = wx.a;
   private boolean i = true;
   private boolean j = true;
   private fge.b k = fge.b.a;
   private fge.b l = fge.b.a;
   private o m = o.v;
   private fge.a n = fge.a.a;
   private final xv o;

   public ffx(fgc $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = wy.b($$1);
      this.o = xv.a.a($$1).a(new xe.e(wy.b($$1)));
   }

   public ffx.a a() {
      return new ffx.a(
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

   public fgc b() {
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
      o $$1 = this.o();
      if ($$1 != o.v) {
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
      o $$2 = this.o();
      if ($$2 != o.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xm a(@Nullable fge $$0, wy $$1) {
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
   public fge.b k() {
      return this.k;
   }

   @Override
   public fge.b l() {
      return this.l;
   }

   public void a(fge.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(fge.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public fge.a m() {
      return this.n;
   }

   public void a(fge.a $$0) {
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

   public static record a(String b, Optional<wy> c, Optional<o> d, boolean e, boolean f, wy g, wy h, fge.b i, fge.b j, fge.a k, List<String> l) {
      public static final Codec<ffx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("Name").forGetter(ffx.a::a),
                  xa.a.optionalFieldOf("DisplayName").forGetter(ffx.a::b),
                  o.x.optionalFieldOf("TeamColor").forGetter(ffx.a::c),
                  Codec.BOOL.optionalFieldOf("AllowFriendlyFire", true).forGetter(ffx.a::d),
                  Codec.BOOL.optionalFieldOf("SeeFriendlyInvisibles", true).forGetter(ffx.a::e),
                  xa.a.optionalFieldOf("MemberNamePrefix", wx.a).forGetter(ffx.a::f),
                  xa.a.optionalFieldOf("MemberNameSuffix", wx.a).forGetter(ffx.a::g),
                  fge.b.e.optionalFieldOf("NameTagVisibility", fge.b.a).forGetter(ffx.a::h),
                  fge.b.e.optionalFieldOf("DeathMessageVisibility", fge.b.a).forGetter(ffx.a::i),
                  fge.a.e.optionalFieldOf("CollisionRule", fge.a.a).forGetter(ffx.a::j),
                  Codec.STRING.listOf().optionalFieldOf("Players", List.of()).forGetter(ffx.a::k)
               )
               .apply($$0, ffx.a::new)
      );

      public String a() {
         return this.b;
      }

      public Optional<wy> b() {
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

      public wy f() {
         return this.g;
      }

      public wy g() {
         return this.h;
      }

      public fge.b h() {
         return this.i;
      }

      public fge.b i() {
         return this.j;
      }

      public fge.a j() {
         return this.k;
      }

      public List<String> k() {
         return this.l;
      }
   }
}
