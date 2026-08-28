import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;

public class adb {
   private static final ym<ByteBuf, byte[]> a = yk.a(2048);
   private final BitSet b;
   private final BitSet c;
   private final BitSet d;
   private final BitSet e;
   private final List<byte[]> f;
   private final List<byte[]> g;

   public adb(dfm $$0, esm $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = new BitSet();
      this.c = new BitSet();
      this.d = new BitSet();
      this.e = new BitSet();
      this.f = Lists.newArrayList();
      this.g = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$1.c(); $$4++) {
         if ($$2 == null || $$2.get($$4)) {
            this.a($$0, $$1, dgp.a, $$4, this.b, this.d, this.f);
         }

         if ($$3 == null || $$3.get($$4)) {
            this.a($$0, $$1, dgp.b, $$4, this.c, this.e, this.g);
         }
      }
   }

   public adb(vl $$0, int $$1, int $$2) {
      this.b = $$0.w();
      this.c = $$0.w();
      this.d = $$0.w();
      this.e = $$0.w();
      this.f = $$0.a(a);
      this.g = $$0.a(a);
   }

   public void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f, a);
      $$0.a(this.g, a);
   }

   private void a(dfm $$0, esm $$1, dgp $$2, int $$3, BitSet $$4, BitSet $$5, List<byte[]> $$6) {
      dyv $$7 = $$1.a($$2).a(kk.a($$0, $$1.d() + $$3));
      if ($$7 != null) {
         if ($$7.d()) {
            $$5.set($$3);
         } else {
            $$4.set($$3);
            $$6.add($$7.b().a());
         }
      }
   }

   public BitSet a() {
      return this.b;
   }

   public BitSet b() {
      return this.d;
   }

   public List<byte[]> c() {
      return this.f;
   }

   public BitSet d() {
      return this.c;
   }

   public BitSet e() {
      return this.e;
   }

   public List<byte[]> f() {
      return this.g;
   }
}
