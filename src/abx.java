import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class abx implements xx<aag> {
   public static final xo<uq, abx> a = xx.a(abx::a, abx::new);
   private final int b;
   private final byte c;
   private final boolean d;
   @Nullable
   private final List<eid> e;
   @Nullable
   private final eig.b f;

   public abx(int $$0, byte $$1, boolean $$2, @Nullable Collection<eid> $$3, @Nullable eig.b $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3 != null ? Lists.newArrayList($$3) : null;
      this.f = $$4;
   }

   private abx(uq $$0) {
      this.b = $$0.n();
      this.c = $$0.readByte();
      this.d = $$0.readBoolean();
      this.e = $$0.c((xp<? super uq, List<eid>>)($$0x -> $$0x.a((xp<? super uq, eid>)($$0xx -> {
            eid.a $$1x = $$0xx.b(eid.a.class);
            byte $$2x = $$0xx.readByte();
            byte $$3x = $$0xx.readByte();
            byte $$4x = (byte)($$0xx.readByte() & 15);
            vq $$5x = $$0xx.c(uq::m);
            return new eid($$1x, $$2x, $$3x, $$4x, $$5x);
         }))));
      int $$1 = $$0.readUnsignedByte();
      if ($$1 > 0) {
         int $$2 = $$0.readUnsignedByte();
         int $$3 = $$0.readUnsignedByte();
         int $$4 = $$0.readUnsignedByte();
         byte[] $$5 = $$0.b();
         this.f = new eig.b($$3, $$4, $$1, $$2, $$5);
      } else {
         this.f = null;
      }
   }

   private void a(uq $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$0x.a($$1, ($$0xx, $$1x) -> {
            $$0xx.a($$1x.c());
            $$0xx.k($$1x.d());
            $$0xx.k($$1x.e());
            $$0xx.k($$1x.f() & 15);
            $$0xx.a($$1x.g(), uq::a);
         }));
      if (this.f != null) {
         $$0.k(this.f.c);
         $$0.k(this.f.d);
         $$0.k(this.f.a);
         $$0.k(this.f.b);
         $$0.a(this.f.e);
      } else {
         $$0.k(0);
      }
   }

   @Override
   public xz<abx> a() {
      return aeq.O;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public void a(eig $$0) {
      if (this.e != null) {
         $$0.a(this.e);
      }

      if (this.f != null) {
         this.f.a($$0);
      }
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
