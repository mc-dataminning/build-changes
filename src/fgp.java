import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class fgp {
   private final fgx a;
   private final String b;
   private final fha c;
   private xc d;
   private xc e;
   private fha.a f;
   private boolean g;
   @Nullable
   private ys h;

   public fgp(fgx $$0, String $$1, fha $$2, xc $$3, fha.a $$4, boolean $$5, @Nullable ys $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.j();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public fgp.a a() {
      return new fgp.a(this.b, this.c, this.d, this.f, this.g, Optional.ofNullable(this.h));
   }

   public fgx b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }

   public fha d() {
      return this.c;
   }

   public xc e() {
      return this.d;
   }

   public boolean f() {
      return this.g;
   }

   @Nullable
   public ys g() {
      return this.h;
   }

   public ys a(ys $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xc j() {
      return xf.a((xc)this.d.f().a($$0 -> $$0.a(new xi.e(xc.b(this.b)))));
   }

   public xc h() {
      return this.e;
   }

   public void a(xc $$0) {
      this.d = $$0;
      this.e = this.j();
      this.a.b(this);
   }

   public fha.a i() {
      return this.f;
   }

   public void a(fha.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable ys $$0) {
      this.h = $$0;
      this.a.b(this);
   }

   public static record a(String b, fha c, xc d, fha.a e, boolean f, Optional<ys> g) {
      public static final Codec<fgp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("Name").forGetter(fgp.a::a),
                  fha.b.optionalFieldOf("CriteriaName", fha.c).forGetter(fgp.a::b),
                  xe.a.fieldOf("DisplayName").forGetter(fgp.a::c),
                  fha.a.c.optionalFieldOf("RenderType", fha.a.a).forGetter(fgp.a::d),
                  Codec.BOOL.optionalFieldOf("display_auto_update", false).forGetter(fgp.a::e),
                  yu.b.optionalFieldOf("format").forGetter(fgp.a::f)
               )
               .apply($$0, fgp.a::new)
      );

      public String a() {
         return this.b;
      }

      public fha b() {
         return this.c;
      }

      public xc c() {
         return this.d;
      }

      public fha.a d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public Optional<ys> f() {
         return this.g;
      }
   }
}
