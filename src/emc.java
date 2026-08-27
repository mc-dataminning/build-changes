import java.util.function.Predicate;
import javax.annotation.Nullable;

public class emc implements elx {
   protected static final elx a = new emc(false, -Double.MAX_VALUE, cmx.f, $$0 -> false, null) {
      @Override
      public boolean a(eml $$0, hx $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final cmx d;
   private final Predicate<eeq> e;
   @Nullable
   private final blu f;

   protected emc(boolean $$0, double $$1, cmx $$2, Predicate<eeq> $$3, @Nullable blu $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Deprecated
   protected emc(blu $$0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual blu.bW ()Z
      // 05: aload 1
      // 06: invokevirtual blu.dt ()D
      // 09: aload 1
      // 0a: instanceof bmk
      // 0d: ifeq 1a
      // 10: aload 1
      // 11: checkcast bmk
      // 14: invokevirtual bmk.eT ()Lcmx;
      // 17: goto 1d
      // 1a: getstatic cmx.f Lcmx;
      // 1d: aload 1
      // 1e: instanceof bmk
      // 21: ifeq 35
      // 24: aload 1
      // 25: checkcast bmk
      // 28: dup
      // 29: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c: pop
      // 2d: invokedynamic test (Lbmk;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, bmk.a (Leeq;)Z, (Leeq;)Z ]
      // 32: goto 3a
      // 35: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, emc.a (Leeq;)Z, (Leeq;)Z ]
      // 3a: aload 1
      // 3b: invokespecial emc.<init> (ZDLcmx;Ljava/util/function/Predicate;Lblu;)V
      // 3e: return
   }

   @Override
   public boolean a(cms $$0) {
      return this.d.a($$0);
   }

   @Override
   public boolean a(eeq $$0, eeq $$1) {
      return this.e.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(eml $$0, hx $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(ic.a.b) - 1.0E-5F;
   }

   @Nullable
   public blu c() {
      return this.f;
   }
}
