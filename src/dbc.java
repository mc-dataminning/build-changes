import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbc(ju<bum> c) implements dba {
   public static final MapCodec<dbc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kf.a(mb.W).fieldOf("effects").forGetter(dbc::b)).apply($$0, dbc::new));
   public static final zt<xg, dbc> b = zt.a(zr.c(mb.W), dbc::b, dbc::new);

   public dbc(jq<bum> $$0) {
      this(ju.a($$0));
   }

   @Override
   public dba.a<dbc> a() {
      return dba.a.b;
   }

   @Override
   public boolean a(dhh $$0, cxo $$1, bwf $$2) {
      boolean $$3 = false;

      for (jq<bum> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public ju<bum> b() {
      return this.c;
   }
}
