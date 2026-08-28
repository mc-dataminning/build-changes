import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dxf(aly<ewu> d, double e, double f, cxp g, Optional<aly<ewu>> h, dww i, dww.a j) {
   static final String a = "config";
   static dxf b = new dxf();
   static Codec<dxf> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aly.a(mb.bg).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dxf::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dxf::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dxf::d),
                  cxp.a("key_item").forGetter(dxf::e),
                  aly.a(mb.bg).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dxf::f)
               )
               .apply($$0, dxf::new)
      )
      .validate(dxf::h);

   private dxf() {
      this(ewl.R, 4.0, 4.5, new cxp(cxt.zt), Optional.empty(), dww.b, dww.a.a);
   }

   public dxf(aly<ewu> $$0, double $$1, double $$2, cxp $$3, Optional<aly<ewu>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dww a() {
      return this.i;
   }

   private DataResult<dxf> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public aly<ewu> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cxp e() {
      return this.g;
   }

   public Optional<aly<ewu>> f() {
      return this.h;
   }

   public dww.a g() {
      return this.j;
   }
}
