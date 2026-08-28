import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record dap(List<dap.a> e) implements czv, dar {
   public static final dap a = new dap(List.of());
   public static final int b = 160;
   public static final Codec<dap> c = dap.a.a.listOf().xmap(dap::new, dap::a);
   public static final zt<xg, dap> d = dap.a.b.a(zr.a()).a(dap::new, dap::a);

   public dap a(dap.a $$0) {
      return new dap(ae.a(this.e, $$0));
   }

   @Override
   public void a(dhh $$0, bwf $$1, cxo $$2, czu $$3) {
      for (dap.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cxk.b $$0, Consumer<xv> $$1, czg $$2) {
      if ($$2.b()) {
         List<buo> $$3 = new ArrayList<>();

         for (dap.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         czn.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<dap.a> a() {
      return this.e;
   }

   public static record a(jq<bum> c, int d) {
      public static final Codec<dap.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bum.a.fieldOf("id").forGetter(dap.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(dap.a::c))
               .apply($$0, dap.a::new)
      );
      public static final zt<xg, dap.a> b = zt.a(bum.b, dap.a::b, zr.h, dap.a::c, dap.a::new);

      public buo a() {
         return new buo(this.c, this.d);
      }

      public jq<bum> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
