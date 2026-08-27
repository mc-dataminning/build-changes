import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record agg(ja<dwu> a, aks<dca> b, long c, dbx d, @Nullable dbx e, boolean f, boolean g, Optional<iz> h, int i, @Nullable UUID j) {
   private static final zc<wp, ja<dwu>> k = za.b(li.aE);

   public agg(wp $$0) {
      this(
         k.decode($$0),
         $$0.a(li.aS),
         $$0.readLong(),
         dbx.a($$0.readByte()),
         dbx.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(we::h),
         $$0.l(),
         $$0.c(ju.g)
      );
   }

   public void a(wp $$0) {
      k.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(dbx.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, we::a);
      $$0.c(this.i);
      $$0.a(this.j, ju.g);
   }
}
