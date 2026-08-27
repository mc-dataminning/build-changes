import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ekb extends ekh {
   public static final Codec<ekb> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(emq.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ekb::new)
   );
   private final emp b;
   private final boolean c;

   ekb(List<elu> $$0, emp $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ekj b() {
      return ekk.d;
   }

   @Override
   public Set<eld<?>> a() {
      return this.b.a();
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      awo $$2 = $$1.b();
      return ctj.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static ekb.a a(emp $$0) {
      return new ekb.a($$0);
   }

   public static class a extends ekh.a<ekb.a> {
      private final emp a;
      private boolean b;

      public a(emp $$0) {
         this.a = $$0;
      }

      protected ekb.a a() {
         return this;
      }

      public ekb.a e() {
         this.b = true;
         return this;
      }

      @Override
      public eki b() {
         return new ekb(this.g(), this.a, this.b);
      }
   }
}
