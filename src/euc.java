import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euc(euf b) implements euf {
   public static final MapCodec<euc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(euf.e.fieldOf("term").forGetter(euc::c)).apply($$0, euc::new));

   @Override
   public eug b() {
      return euh.a;
   }

   public boolean a(equ $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<etn<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(era $$0) {
      euf.super.a($$0);
      this.b.a($$0);
   }

   public static euf.a a(euf.a $$0) {
      euc $$1 = new euc($$0.build());
      return () -> $$1;
   }

   public euf c() {
      return this.b;
   }
}
