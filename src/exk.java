import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exk extends exd {
   public static final MapCodec<exk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dtp.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, exk::new)
   );
   private final dtp b;
   private final boolean c;

   exk(List<eyz> $$0, dtp $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwo a(cwo $$0, evq $$1) {
      if (this.c) {
         $$0.a(kv.ai, dtp.a, this.b, ($$0x, $$1x) -> new dtp.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kv.ai, this.b);
      }

      return $$0;
   }

   @Override
   public exf<exk> b() {
      return exg.E;
   }

   public static exk.a a(boolean $$0) {
      return new exk.a($$0);
   }

   public static class a extends exd.a<exk.a> {
      private final dtp.a a = new dtp.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected exk.a a() {
         return this;
      }

      @Override
      public exe b() {
         return new exk(this.g(), this.a.a(), this.b);
      }

      public exk.a a(jr<dto> $$0, cvl $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
