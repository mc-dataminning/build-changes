import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epv extends epo {
   public static final Codec<epv> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(dmu.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, epv::new)
   );
   private final dmu b;
   private final boolean c;

   epv(List<erh> $$0, dmu $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected csd a(csd $$0, eoa $$1) {
      if (this.c) {
         $$0.a(jz.N, dmu.a, this.b, ($$0x, $$1x) -> new dmu.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(jz.N, this.b);
      }

      return $$0;
   }

   @Override
   public epq b() {
      return epr.z;
   }

   public static epv.a a(boolean $$0) {
      return new epv.a($$0);
   }

   public static class a extends epo.a<epv.a> {
      private final dmu.a a = new dmu.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected epv.a a() {
         return this;
      }

      @Override
      public epp b() {
         return new epv(this.g(), this.a.a(), this.b);
      }

      public epv.a a(iv<dmt> $$0, cqw $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
