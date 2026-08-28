import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyi extends eyb {
   public static final MapCodec<eyi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(duj.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, eyi::new)
   );
   private final duj b;
   private final boolean c;

   eyi(List<ezx> $$0, duj $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cxh a(cxh $$0, ewo $$1) {
      if (this.c) {
         $$0.a(kv.ak, duj.a, this.b, ($$0x, $$1x) -> new duj.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kv.ak, this.b);
      }

      return $$0;
   }

   @Override
   public eyd<eyi> b() {
      return eye.E;
   }

   public static eyi.a a(boolean $$0) {
      return new eyi.a($$0);
   }

   public static class a extends eyb.a<eyi.a> {
      private final duj.a a = new duj.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eyi.a a() {
         return this;
      }

      @Override
      public eyc b() {
         return new eyi(this.g(), this.a.a(), this.b);
      }

      public eyi.a a(jr<dui> $$0, cwe $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
