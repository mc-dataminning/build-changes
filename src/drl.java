import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record drl(ald<eqm> d, double e, double f, cuo g, Optional<ald<eqm>> h, drd i, drd.a j) {
   static final String a = "config";
   static drl b = new drl();
   static Codec<drl> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ald.a(lq.aU).lenientOptionalFieldOf("loot_table", b.b()).forGetter(drl::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(drl::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(drl::d),
                  cuo.a("key_item").forGetter(drl::e),
                  ald.a(lq.aU).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(drl::f)
               )
               .apply($$0, drl::new)
      )
      .validate(drl::h);

   private drl() {
      this(eqd.S, 4.0, 4.5, new cuo(cur.yz), Optional.empty(), drd.b, drd.a.a);
   }

   public drl(ald<eqm> $$0, double $$1, double $$2, cuo $$3, Optional<ald<eqm>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public drd a() {
      return this.i;
   }

   private DataResult<drl> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ald<eqm> b() {
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

   public Optional<ald<eqm>> f() {
      return this.h;
   }

   public drd.a g() {
      return this.j;
   }
}
