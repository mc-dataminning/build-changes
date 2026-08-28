import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdn(fdq b) implements fdq {
   public static final MapCodec<fdn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fdq.e.fieldOf("term").forGetter(fdn::c)).apply($$0, fdn::new));

   @Override
   public fdr b() {
      return fds.a;
   }

   public boolean a(fah $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<baz<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(fan $$0) {
      fdq.super.a($$0);
      this.b.a($$0);
   }

   public static fdq.a a(fdq.a $$0) {
      fdn $$1 = new fdn($$0.build());
      return () -> $$1;
   }

   public fdq c() {
      return this.b;
   }
}
