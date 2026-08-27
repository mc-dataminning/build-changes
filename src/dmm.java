import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmm {
   public static final dmm a = new dmm(false, csr.gz.n(), csr.pL.n(), csr.ek.n(), csr.aQ.n());
   public static final Codec<dmm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dmm::a),
               dfe.b.optionalFieldOf("air_state", a.b()).forGetter(dmm::b),
               dfe.b.optionalFieldOf("water_state", a.b()).forGetter(dmm::c),
               dfe.b.optionalFieldOf("lava_state", a.b()).forGetter(dmm::d),
               dfe.b.optionalFieldOf("barrier_state", a.b()).forGetter(dmm::e)
            )
            .apply($$0, dmm::new)
   );
   private final boolean c;
   private final dfe d;
   private final dfe e;
   private final dfe f;
   private final dfe g;

   public static dmm a(boolean $$0, dfe $$1, dfe $$2, dfe $$3, dfe $$4) {
      return new dmm($$0, $$1, $$2, $$3, $$4);
   }

   public static dmm a(dfe $$0, dfe $$1, dfe $$2, dfe $$3) {
      return new dmm(false, $$0, $$1, $$2, $$3);
   }

   public static dmm a(boolean $$0, dfe $$1) {
      return new dmm($$0, $$1, a.c(), a.d(), a.e());
   }

   private dmm(boolean $$0, dfe $$1, dfe $$2, dfe $$3, dfe $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dfe b() {
      return this.d;
   }

   public dfe c() {
      return this.e;
   }

   public dfe d() {
      return this.f;
   }

   public dfe e() {
      return this.g;
   }
}
