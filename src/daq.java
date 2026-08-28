import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record daq(List<daq.a> e) implements czw, das {
   public static final daq a = new daq(List.of());
   public static final int b = 160;
   public static final Codec<daq> c = daq.a.a.listOf().xmap(daq::new, daq::a);
   public static final zt<xg, daq> d = daq.a.b.a(zr.a()).a(daq::new, daq::a);

   public daq a(daq.a $$0) {
      return new daq(ae.a(this.e, $$0));
   }

   @Override
   public void a(dhi $$0, bwg $$1, cxp $$2, czv $$3) {
      for (daq.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cxl.b $$0, Consumer<xv> $$1, czh $$2) {
      if ($$2.b()) {
         List<bup> $$3 = new ArrayList<>();

         for (daq.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         czo.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<daq.a> a() {
      return this.e;
   }

   public static record a(jq<bun> c, int d) {
      public static final Codec<daq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bun.a.fieldOf("id").forGetter(daq.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(daq.a::c))
               .apply($$0, daq.a::new)
      );
      public static final zt<xg, daq.a> b = zt.a(bun.b, daq.a::b, zr.h, daq.a::c, daq.a::new);

      public bup a() {
         return new bup(this.c, this.d);
      }

      public jq<bun> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
