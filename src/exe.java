import java.util.function.Predicate;
import javax.annotation.Nullable;

public class exe implements ewz {
   protected static final ewz a = new exe(false, -Double.MAX_VALUE, cuh.i, $$0 -> false, null) {
      @Override
      public boolean a(exn $$0, ir $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final cuh d;
   private final Predicate<epe> e;
   @Nullable
   private final brv f;

   protected exe(boolean $$0, double $$1, cuh $$2, Predicate<epe> $$3, @Nullable brv $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Deprecated
   protected exe(brv $$0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.struct.gen.VarType.equals(Object)" because "curType" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.setLambdaGenericTypes(NewExprent.java:668)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:401)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:745)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:714)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.toJava(FunctionExprent.java:625)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1018)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:902)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:895)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:90)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1283)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual brv.ce ()Z
      // 05: aload 1
      // 06: invokevirtual brv.dB ()D
      // 09: aload 1
      // 0a: instanceof bso
      // 0d: ifeq 1a
      // 10: aload 1
      // 11: checkcast bso
      // 14: invokevirtual bso.fg ()Lcuh;
      // 17: goto 1d
      // 1a: getstatic cuh.i Lcuh;
      // 1d: aload 1
      // 1e: instanceof bso
      // 21: ifeq 35
      // 24: aload 1
      // 25: checkcast bso
      // 28: dup
      // 29: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c: pop
      // 2d: invokedynamic test (Lbso;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, bso.a (Lepe;)Z, (Lepe;)Z ]
      // 32: goto 3a
      // 35: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, exe.a (Lepe;)Z, (Lepe;)Z ]
      // 3a: aload 1
      // 3b: invokespecial exe.<init> (ZDLcuh;Ljava/util/function/Predicate;Lbrv;)V
      // 3e: return
   }

   @Override
   public boolean a(cuc $$0) {
      return this.d.a($$0);
   }

   @Override
   public boolean a(epe $$0, epe $$1) {
      return this.e.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(exn $$0, ir $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(iw.a.b) - 1.0E-5F;
   }

   @Nullable
   public brv c() {
      return this.f;
   }
}
