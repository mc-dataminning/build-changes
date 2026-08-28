import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esp extends esv {
   public static final MapCodec<esp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eqr.b.fieldOf("feature").forGetter($$0x -> $$0x.b), f()).apply($$0, esp::new)
   );
   private final jf<eqr> b;
   private final tz c;

   protected esp(jf<eqr> $$0, esx.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private tz b() {
      tz $$0 = new tz();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dyv.a.a.c());
      return $$0;
   }

   @Override
   public ka a(evq $$0, dtl $$1) {
      return ka.i;
   }

   @Override
   public List<evp.a> a(evq $$0, iv $$1, dtl $$2, azv $$3) {
      return List.of(evp.a.a(new evp.d($$1, dmt.pH.m().b(dqy.b, jd.a(jb.a, jb.d)), this.c)));
   }

   @Override
   public erf a(evq $$0, iv $$1, dtl $$2) {
      ka $$3 = this.a($$0, $$2);
      return new erf($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(evq $$0, dkl $$1, dki $$2, ecr $$3, iv $$4, iv $$5, dtl $$6, erf $$7, azv $$8, euz $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public esw<?> a() {
      return esw.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
