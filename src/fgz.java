import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class fgz {
   private final fhh a;
   private final String b;
   private final fhk c;
   private xg d;
   private xg e;
   private fhk.a f;
   private boolean g;
   @Nullable
   private yw h;

   public fgz(fhh $$0, String $$1, fhk $$2, xg $$3, fhk.a $$4, boolean $$5, @Nullable yw $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.j();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public fgz.a a() {
      return new fgz.a(this.b, this.c, this.d, this.f, this.g, Optional.ofNullable(this.h));
   }

   public fhh b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }

   public fhk d() {
      return this.c;
   }

   public xg e() {
      return this.d;
   }

   public boolean f() {
      return this.g;
   }

   @Nullable
   public yw g() {
      return this.h;
   }

   public yw a(yw $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xg j() {
      return xj.a((xg)this.d.f().a($$0 -> $$0.a(new xm.e(xg.b(this.b)))));
   }

   public xg h() {
      return this.e;
   }

   public void a(xg $$0) {
      this.d = $$0;
      this.e = this.j();
      this.a.b(this);
   }

   public fhk.a i() {
      return this.f;
   }

   public void a(fhk.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yw $$0) {
      this.h = $$0;
      this.a.b(this);
   }

   public static record a(String b, fhk c, xg d, fhk.a e, boolean f, Optional<yw> g) {
      public static final Codec<fgz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("Name").forGetter(fgz.a::a),
                  fhk.b.optionalFieldOf("CriteriaName", fhk.c).forGetter(fgz.a::b),
                  xi.a.fieldOf("DisplayName").forGetter(fgz.a::c),
                  fhk.a.c.optionalFieldOf("RenderType", fhk.a.a).forGetter(fgz.a::d),
                  Codec.BOOL.optionalFieldOf("display_auto_update", false).forGetter(fgz.a::e),
                  yy.b.optionalFieldOf("format").forGetter(fgz.a::f)
               )
               .apply($$0, fgz.a::new)
      );

      public String a() {
         return this.b;
      }

      public fhk b() {
         return this.c;
      }

      public xg c() {
         return this.d;
      }

      public fhk.a d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public Optional<yw> f() {
         return this.g;
      }
   }
}
