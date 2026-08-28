import java.util.stream.Stream;

public abstract class enq extends enr {
   @Override
   public final Stream<jh> a_(enp $$0, bam $$1, jh $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(enp var1, bam var2, jh var3);
}
