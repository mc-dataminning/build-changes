import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class ffz {
   private final fgh a;
   private final String b;
   private final fgk c;
   private wy d;
   private wy e;
   private fgk.a f;
   private boolean g;
   @Nullable
   private yo h;

   public ffz(fgh $$0, String $$1, fgk $$2, wy $$3, fgk.a $$4, boolean $$5, @Nullable yo $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.j();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public ffz.a a() {
      return new ffz.a(this.b, this.c, this.d, this.f, this.g, Optional.ofNullable(this.h));
   }

   public fgh b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }

   public fgk d() {
      return this.c;
   }

   public wy e() {
      return this.d;
   }

   public boolean f() {
      return this.g;
   }

   @Nullable
   public yo g() {
      return this.h;
   }

   public yo a(yo $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private wy j() {
      return xb.a((wy)this.d.f().a($$0 -> $$0.a(new xe.e(wy.b(this.b)))));
   }

   public wy h() {
      return this.e;
   }

   public void a(wy $$0) {
      this.d = $$0;
      this.e = this.j();
      this.a.b(this);
   }

   public fgk.a i() {
      return this.f;
   }

   public void a(fgk.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yo $$0) {
      this.h = $$0;
      this.a.b(this);
   }

   public static record a(String b, fgk c, wy d, fgk.a e, boolean f, Optional<yo> g) {
      public static final Codec<ffz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("Name").forGetter(ffz.a::a),
                  fgk.b.optionalFieldOf("CriteriaName", fgk.c).forGetter(ffz.a::b),
                  xa.a.fieldOf("DisplayName").forGetter(ffz.a::c),
                  fgk.a.c.optionalFieldOf("RenderType", fgk.a.a).forGetter(ffz.a::d),
                  Codec.BOOL.optionalFieldOf("display_auto_update", false).forGetter(ffz.a::e),
                  yq.b.optionalFieldOf("format").forGetter(ffz.a::f)
               )
               .apply($$0, ffz.a::new)
      );

      public String a() {
         return this.b;
      }

      public fgk b() {
         return this.c;
      }

      public wy c() {
         return this.d;
      }

      public fgk.a d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public Optional<yo> f() {
         return this.g;
      }
   }
}
