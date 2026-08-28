import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class exr extends eyb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<exr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kg.a(mc.aP).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exr::new)
   );
   private final Optional<jv<ddr>> c;
   private final boolean d;

   exr(List<ezx> $$0, Optional<jv<ddr>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eyd<exr> b() {
      return eye.h;
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      azh $$2 = $$1.b();
      boolean $$3 = $$0.a(cxl.ry);
      boolean $$4 = !$$3 && this.d;
      Stream<jr<ddr>> $$5 = this.c
         .<Stream<jr<ddr>>>map(jv::a)
         .orElseGet(() -> $$1.d().F_().e(mc.aP).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((ddr)$$2x.a()).c($$0));
      List<jr<ddr>> $$6 = $$5.toList();
      Optional<jr<ddr>> $$7 = af.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cxh a(cxh $$0, jr<ddr> $$1, azh $$2) {
      int $$3 = ayz.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cxl.ry)) {
         $$0 = new cxh(cxl.vx);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static exr.a c() {
      return new exr.a();
   }

   public static exr.a a(jt.a $$0) {
      return c().a($$0.d(mc.aP).b(aws.n));
   }

   public static class a extends eyb.a<exr.a> {
      private Optional<jv<ddr>> a = Optional.empty();
      private boolean b = true;

      protected exr.a a() {
         return this;
      }

      public exr.a a(jr<ddr> $$0) {
         this.a = Optional.of(jv.a($$0));
         return this;
      }

      public exr.a a(jv<ddr> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exr.a e() {
         this.b = false;
         return this;
      }

      @Override
      public eyc b() {
         return new exr(this.g(), this.a, this.b);
      }
   }
}
