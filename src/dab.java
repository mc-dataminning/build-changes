import com.google.common.collect.HashMultimap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;

public record dab(String b, jj<buf> d, czt e, bui.a f, UUID g) implements dad {
   public static final MapCodec<dab> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("name").forGetter(dab::b),
               buf.a.fieldOf("attribute").forGetter(dab::c),
               czt.b.fieldOf("amount").forGetter(dab::d),
               bui.a.f.fieldOf("operation").forGetter(dab::e),
               kd.d.fieldOf("uuid").forGetter(dab::f)
            )
            .apply($$0, dab::new)
   );

   public bui a(int $$0) {
      return new bui(this.f(), this.b(), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4, boolean $$5) {
      if ($$5 && $$3 instanceof btc $$6) {
         $$6.eU().a(this.b($$1));
      }
   }

   @Override
   public void a(czl $$0, bsh $$1, ewh $$2, int $$3) {
      if ($$1 instanceof btc $$4) {
         $$4.eU().b(this.b($$3));
      }
   }

   private HashMultimap<jj<buf>, bui> b(int $$0) {
      HashMultimap<jj<buf>, bui> $$1 = HashMultimap.create();
      $$1.put(this.d, this.a($$0));
      return $$1;
   }

   @Override
   public MapCodec<dab> a() {
      return a;
   }

   public jj<buf> c() {
      return this.d;
   }

   public czt d() {
      return this.e;
   }

   public bui.a e() {
      return this.f;
   }

   public UUID f() {
      return this.g;
   }
}
