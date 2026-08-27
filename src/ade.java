import com.google.common.collect.Lists;
import io.netty.handler.codec.DecoderException;
import java.util.Collection;
import java.util.List;

public class ade implements xg<zb> {
   private final int a;
   private final List<ade.a> b;

   public ade(int $$0, Collection<bnq> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bnq $$2 : $$1) {
         this.b.add(new ade.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public ade(uj $$0) {
      this.a = $$0.n();
      this.b = $$0.a(
         (uj.a<ade.a>)($$0x -> {
            ih<bnp> $$1 = $$0x.a(kd.u.t());
            if ($$1 == null) {
               throw new DecoderException("Received unrecognized attribute id");
            } else {
               double $$2 = $$0x.readDouble();
               List<bns> $$3 = $$0x.a(
                  (uj.a<bns>)($$0xx -> new bns($$0xx.p(), "Unknown synced attribute modifier", $$0xx.readDouble(), bns.a.a($$0xx.readByte())))
               );
               return new ade.a($$1, $$2, $$3);
            }
         })
      );
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.a);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a(kd.u.t(), $$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c(), ($$0xx, $$1x) -> {
            $$0xx.a($$1x.a());
            $$0xx.a($$1x.c());
            $$0xx.k($$1x.b().a());
         });
      });
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<ade.a> d() {
      return this.b;
   }

   public static record a(ih<bnp> a, double b, Collection<bns> c) {
   }
}
