import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dsk(akp<erq> d, double e, double f, cuo g, Optional<akp<erq>> h, dsc i, dsc.a j) {
   static final String a = "config";
   static dsk b = new dsk();
   static Codec<dsk> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akp.a(lu.bc).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dsk::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dsk::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dsk::d),
                  cuo.a("key_item").forGetter(dsk::e),
                  akp.a(lu.bc).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dsk::f)
               )
               .apply($$0, dsk::new)
      )
      .validate(dsk::h);

   private dsk() {
      this(erh.S, 4.0, 4.5, new cuo(cur.yC), Optional.empty(), dsc.b, dsc.a.a);
   }

   public dsk(akp<erq> $$0, double $$1, double $$2, cuo $$3, Optional<akp<erq>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dsc a() {
      return this.i;
   }

   private DataResult<dsk> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public akp<erq> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cuo e() {
      return this.g;
   }

   public Optional<akp<erq>> f() {
      return this.h;
   }

   public dsc.a g() {
      return this.j;
   }
}
