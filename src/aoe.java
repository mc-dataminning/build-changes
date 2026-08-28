import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface aoe<T, R> {
   R apply(T var1) throws CommandSyntaxException;
}
