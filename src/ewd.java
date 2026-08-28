import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ewd implements evy {
   protected static final evy a = new ewd(false, -Double.MAX_VALUE, cur.l, $$0 -> false, null) {
      @Override
      public boolean a(ewm $$0, iz $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final cur d;
   private final Predicate<enx> e;
   @Nullable
   private final bsw f;

   protected ewd(boolean $$0, double $$1, cur $$2, Predicate<enx> $$3, @Nullable bsw $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Deprecated
   protected ewd(bsw $$0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual bsw.bZ ()Z
      // 05: aload 1
      // 06: invokevirtual bsw.dw ()D
      // 09: aload 1
      // 0a: instanceof btr
      // 0d: ifeq 1a
      // 10: aload 1
      // 11: checkcast btr
      // 14: invokevirtual btr.eX ()Lcur;
      // 17: goto 1d
      // 1a: getstatic cur.l Lcur;
      // 1d: aload 1
      // 1e: instanceof btr
      // 21: ifeq 35
      // 24: aload 1
      // 25: checkcast btr
      // 28: dup
      // 29: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c: pop
      // 2d: invokedynamic test (Lbtr;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, btr.a (Lenx;)Z, (Lenx;)Z ]
      // 32: goto 3a
      // 35: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, ewd.a (Lenx;)Z, (Lenx;)Z ]
      // 3a: aload 1
      // 3b: invokespecial ewd.<init> (ZDLcur;Ljava/util/function/Predicate;Lbsw;)V
      // 3e: return
   }

   @Override
   public boolean a(cum $$0) {
      return this.d.a($$0);
   }

   @Override
   public boolean a(enx $$0, enx $$1) {
      return this.e.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(ewm $$0, iz $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(je.a.b) - 1.0E-5F;
   }

   @Nullable
   public bsw c() {
      return this.f;
   }
}
