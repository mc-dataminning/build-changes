import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dwf(akt<evu> d, double e, double f, cwn g, Optional<akt<evu>> h, dvw i, dvw.a j) {
   static final String a = "config";
   static dwf b = new dwf();
   static Codec<dwf> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akt.a(mc.bg).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dwf::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dwf::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dwf::d),
                  cwn.a("key_item").forGetter(dwf::e),
                  akt.a(mc.bg).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dwf::f)
               )
               .apply($$0, dwf::new)
      )
      .validate(dwf::h);

   private dwf() {
      this(evl.R, 4.0, 4.5, new cwn(cwr.zD), Optional.empty(), dvw.b, dvw.a.a);
   }

   public dwf(akt<evu> $$0, double $$1, double $$2, cwn $$3, Optional<akt<evu>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dvw a() {
      return this.i;
   }

   private DataResult<dwf> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public akt<evu> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cwn e() {
      return this.g;
   }

   public Optional<akt<evu>> f() {
      return this.h;
   }

   public dvw.a g() {
      return this.j;
   }
}
