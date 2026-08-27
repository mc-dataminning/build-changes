import java.util.Optional;
import javax.annotation.Nullable;

public record abb(aex<diu> a, aex<cpx> b, long c, cpu d, @Nullable cpu e, boolean f, boolean g, Optional<hf> h, int i) {
   public abb(sq $$0) {
      this(
         $$0.a(je.au), $$0.a(je.aH), $$0.readLong(), cpu.a($$0.readByte()), cpu.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(sq::h), $$0.m()
      );
   }

   public void a(sq $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(cpu.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, sq::a);
      $$0.c(this.i);
   }
}
