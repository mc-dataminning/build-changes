import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwe<T extends cvb> implements cvw<T> {
   private final cvb.a<T> x;
   private final Codec<T> y;
   private final yg<vt, T> z;

   public cwe(cvb.a<T> $$0, int $$1) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  awu.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                  cvh.d.fieldOf("category").orElse(cvh.c).forGetter($$0xx -> $$0xx.b),
                  cvp.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.d),
                  crs.b.fieldOf("result").forGetter($$0xx -> $$0xx.e),
                  Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter($$0xx -> $$0xx.f),
                  Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter($$0xx -> $$0xx.g)
               )
               .apply($$2, $$0::create)
      );
      this.z = yg.a(this::a, this::a);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public yg<vt, T> b() {
      return this.z;
   }

   private T a(vt $$0) {
      String $$1 = $$0.p();
      cvh $$2 = $$0.b(cvh.class);
      cvp $$3 = cvp.b.decode($$0);
      crs $$4 = crs.f.decode($$0);
      float $$5 = $$0.readFloat();
      int $$6 = $$0.l();
      return this.x.create($$1, $$2, $$3, $$4, $$5, $$6);
   }

   private void a(vt $$0, T $$1) {
      $$0.a($$1.c);
      $$0.a($$1.f());
      cvp.b.encode($$0, $$1.d);
      crs.f.encode($$0, $$1.e);
      $$0.a($$1.f);
      $$0.c($$1.g);
   }

   public cvb a(String $$0, cvh $$1, cvp $$2, crs $$3, float $$4, int $$5) {
      return this.x.create($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
