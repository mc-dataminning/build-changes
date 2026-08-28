import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class fgn {
   private final fgv a;
   private final String b;
   private final fgy c;
   private xa d;
   private xa e;
   private fgy.a f;
   private boolean g;
   @Nullable
   private yq h;

   public fgn(fgv $$0, String $$1, fgy $$2, xa $$3, fgy.a $$4, boolean $$5, @Nullable yq $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.j();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public fgn.a a() {
      return new fgn.a(this.b, this.c, this.d, this.f, this.g, Optional.ofNullable(this.h));
   }

   public fgv b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }

   public fgy d() {
      return this.c;
   }

   public xa e() {
      return this.d;
   }

   public boolean f() {
      return this.g;
   }

   @Nullable
   public yq g() {
      return this.h;
   }

   public yq a(yq $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xa j() {
      return xd.a((xa)this.d.f().a($$0 -> $$0.a(new xg.e(xa.b(this.b)))));
   }

   public xa h() {
      return this.e;
   }

   public void a(xa $$0) {
      this.d = $$0;
      this.e = this.j();
      this.a.b(this);
   }

   public fgy.a i() {
      return this.f;
   }

   public void a(fgy.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yq $$0) {
      this.h = $$0;
      this.a.b(this);
   }

   public static record a(String b, fgy c, xa d, fgy.a e, boolean f, Optional<yq> g) {
      public static final Codec<fgn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("Name").forGetter(fgn.a::a),
                  fgy.b.optionalFieldOf("CriteriaName", fgy.c).forGetter(fgn.a::b),
                  xc.a.fieldOf("DisplayName").forGetter(fgn.a::c),
                  fgy.a.c.optionalFieldOf("RenderType", fgy.a.a).forGetter(fgn.a::d),
                  Codec.BOOL.optionalFieldOf("display_auto_update", false).forGetter(fgn.a::e),
                  ys.b.optionalFieldOf("format").forGetter(fgn.a::f)
               )
               .apply($$0, fgn.a::new)
      );

      public String a() {
         return this.b;
      }

      public fgy b() {
         return this.c;
      }

      public xa c() {
         return this.d;
      }

      public fgy.a d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public Optional<yq> f() {
         return this.g;
      }
   }
}
