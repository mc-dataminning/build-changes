import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dap implements czx {
   final daq a;
   final cvp b;
   final String c;
   final czv d;
   final boolean e;
   @Nullable
   private dag f;

   public dap(String $$0, czv $$1, daq $$2, cvp $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
      this.e = $$4;
   }

   public dap(String $$0, czv $$1, daq $$2, cvp $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dam<?> aq_() {
      return dam.a;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public czv d() {
      return this.d;
   }

   @Override
   public cvp a(jp.a $$0) {
      return this.b;
   }

   @VisibleForTesting
   public List<Optional<dad>> i() {
      return this.a.c();
   }

   @Override
   public dag a() {
      if (this.f == null) {
         this.f = dag.a(this.a.c());
      }

      return this.f;
   }

   @Override
   public boolean h() {
      return this.e;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= this.a.a() && $$1 >= this.a.b();
   }

   public boolean a(czw $$0, deg $$1) {
      return this.a.a($$0);
   }

   public cvp a(czw $$0, jp.a $$1) {
      return this.a($$1).u();
   }

   public int j() {
      return this.a.a();
   }

   public int k() {
      return this.a.b();
   }

   public static class a implements dam<dap> {
      public static final MapCodec<dap> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  czv.e.fieldOf("category").orElse(czv.d).forGetter($$0x -> $$0x.d),
                  daq.b.forGetter($$0x -> $$0x.a),
                  cvp.d.fieldOf("result").forGetter($$0x -> $$0x.b),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dap::new)
      );
      public static final zb<wo, dap> x = zb.a(dap.a::a, dap.a::a);

      @Override
      public MapCodec<dap> a() {
         return w;
      }

      @Override
      public zb<wo, dap> b() {
         return x;
      }

      private static dap a(wo $$0) {
         String $$1 = $$0.p();
         czv $$2 = $$0.b(czv.class);
         daq $$3 = daq.c.decode($$0);
         cvp $$4 = cvp.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dap($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wo $$0, dap $$1) {
         $$0.a($$1.c);
         $$0.a($$1.d);
         daq.c.encode($$0, $$1.a);
         cvp.i.encode($$0, $$1.b);
         $$0.a($$1.e);
      }
   }
}
